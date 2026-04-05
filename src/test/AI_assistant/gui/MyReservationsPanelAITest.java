package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.junit.Test;

import com.yorku.lab.gui.MyReservationsPanel;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Guest;

public class MyReservationsPanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testBackButtonExists() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Back"));
    }

    @Test
    public void testContainsScrollPane() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findFirst(panel, JScrollPane.class));
    }

    @Test
    public void testListPanelIsInitialized() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "listPanel", JPanel.class));
    }

    @Test
    public void testListPanelUsesGridLayout() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        JPanel listPanel = GuiAITestSupport.getField(panel, "listPanel", JPanel.class);
        assertTrue(listPanel.getLayout() instanceof GridLayout);
    }

    @Test
    public void testRefreshWithNoUserLeavesListEmpty() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        panel.refresh();

        assertEquals(0, GuiAITestSupport.getField(panel, "listPanel", JPanel.class).getComponentCount());
    }

    @Test
    public void testRefreshWithUserAndNoReservationsLeavesListEmpty() {
        Guest guest = new Guest("RES-1", "Guest User", new Credentials("guestres@yorku.ca", "Pass123!"), "CERT");
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();

        assertEquals(0, GuiAITestSupport.getField(panel, "listPanel", JPanel.class).getComponentCount());
    }

    @Test
    public void testSecondRefreshWithNoReservationsStillLeavesListEmpty() {
        Guest guest = new Guest("RES-2", "Guest User", new Credentials("guestres2@yorku.ca", "Pass123!"), "CERT");
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();
        panel.refresh();

        assertEquals(0, GuiAITestSupport.getField(panel, "listPanel", JPanel.class).getComponentCount());
    }

    @Test
    public void testTopBackButtonRemainsAccessibleAfterRefresh() {
        Guest guest = new Guest("RES-3", "Guest User", new Credentials("guestres3@yorku.ca", "Pass123!"), "CERT");
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();

        assertNotNull(GuiAITestSupport.findButton(panel, "Back"));
    }

    @Test
    public void testListPanelStartsEmptyBeforeRefresh() {
        MyReservationsPanel panel = new MyReservationsPanel(GuiAITestSupport.bareApp());
        assertEquals(0, GuiAITestSupport.getField(panel, "listPanel", JPanel.class).getComponentCount());
    }
}
