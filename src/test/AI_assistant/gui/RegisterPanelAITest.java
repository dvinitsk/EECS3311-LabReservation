package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.gui.RegisterPanel;

public class RegisterPanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testTitleLabelExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Register Account"));
    }

    @Test
    public void testEmailFieldExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "emailField", JTextField.class));
    }

    @Test
    public void testPasswordFieldExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "passwordField", JPasswordField.class));
    }

    @Test
    public void testNameFieldExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "nameField", JTextField.class));
    }

    @Test
    public void testIdFieldExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "idField", JTextField.class));
    }

    @Test
    public void testTypeComboContainsFourOptions() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        JComboBox<?> combo = GuiAITestSupport.getField(panel, "typeCombo", JComboBox.class);
        assertEquals(4, combo.getItemCount());
    }

    @Test
    public void testTypeComboStartsWithStudent() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        JComboBox<?> combo = GuiAITestSupport.getField(panel, "typeCombo", JComboBox.class);
        assertEquals(UserType.STUDENT, combo.getItemAt(0));
    }

    @Test
    public void testTypeComboEndsWithGuest() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        JComboBox<?> combo = GuiAITestSupport.getField(panel, "typeCombo", JComboBox.class);
        assertEquals(UserType.GUEST, combo.getItemAt(3));
    }

    @Test
    public void testRegisterButtonExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Register"));
    }

    @Test
    public void testBackButtonExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Back"));
    }

    @Test
    public void testPasswordHintLabelExists() {
        RegisterPanel panel = new RegisterPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "uppercase, lowercase, numbers, symbols"));
    }
}
