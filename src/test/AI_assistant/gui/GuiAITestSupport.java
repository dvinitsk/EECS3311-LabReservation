package test.AI_assistant.gui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.yorku.lab.gui.LabReservationApp;
import com.yorku.lab.gui.LoginPanel;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.facade.ReservationFacade;

import sun.misc.Unsafe;

public final class GuiAITestSupport {

    static {
        System.setProperty("java.awt.headless", "true");
    }

    private GuiAITestSupport() {
    }

    public static LabReservationApp bareApp() {
        return bareApp(new ReservationFacade(), null);
    }

    public static LabReservationApp bareApp(User user) {
        return bareApp(new ReservationFacade(), user);
    }

    public static LabReservationApp bareApp(ReservationFacade facade, User user) {
        try {
            LabReservationApp app = (LabReservationApp) getUnsafe().allocateInstance(LabReservationApp.class);
            setField(app, "facade", facade);
            setField(app, "currentUser", user);
            CardLayout cardLayout = new CardLayout();
            JPanel mainPanel = new JPanel(cardLayout);
            setField(app, "cardLayout", cardLayout);
            setField(app, "mainPanel", mainPanel);
            setField(app, "loginPanel", new LoginPanel(app));
            return app;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void setField(Object target, String fieldName, Object value) {
        try {
            Field field = findField(target.getClass(), fieldName);
            field.setAccessible(true);
            field.set(target, value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T getField(Object target, String fieldName, Class<T> type) {
        try {
            Field field = findField(target.getClass(), fieldName);
            field.setAccessible(true);
            return type.cast(field.get(target));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JButton findButton(Container root, String text) {
        for (JButton button : findAll(root, JButton.class)) {
            if (text.equals(button.getText())) {
                return button;
            }
        }
        return null;
    }

    public static JLabel findLabelContaining(Container root, String text) {
        for (JLabel label : findAll(root, JLabel.class)) {
            if (label.getText() != null && label.getText().contains(text)) {
                return label;
            }
        }
        return null;
    }

    public static <T extends Component> T findFirst(Container root, Class<T> type) {
        List<T> items = findAll(root, type);
        return items.isEmpty() ? null : items.get(0);
    }

    public static <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> items = new ArrayList<>();
        collect(root, type, items);
        return items;
    }

    public static int countComponents(Container root, Class<? extends Component> type) {
        return findAll(root, type).size();
    }

    private static <T extends Component> void collect(Component component, Class<T> type, List<T> items) {
        if (type.isInstance(component)) {
            items.add(type.cast(component));
        }
        if (component instanceof Container container) {
            for (Component child : container.getComponents()) {
                collect(child, type, items);
            }
        }
    }

    private static Field findField(Class<?> type, String fieldName) throws NoSuchFieldException {
        Class<?> current = type;
        while (current != null) {
            try {
                return current.getDeclaredField(fieldName);
            } catch (NoSuchFieldException ignored) {
                current = current.getSuperclass();
            }
        }
        throw new NoSuchFieldException(fieldName);
    }

    private static Unsafe getUnsafe() throws Exception {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        return (Unsafe) field.get(null);
    }

    public static class StubLoginPanel extends LoginPanel {
        private boolean attempted;

        public StubLoginPanel(LabReservationApp app) {
            super(app);
        }

        @Override
        public void attemptLogin() {
            attempted = true;
        }

        public boolean wasAttempted() {
            return attempted;
        }
    }
}
