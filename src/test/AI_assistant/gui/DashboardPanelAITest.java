package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import org.junit.Test;

import com.yorku.lab.gui.DashboardPanel;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Manager;
import com.yorku.lab.model.Student;

public class DashboardPanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testWelcomeLabelExists() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Welcome, User"));
    }

    @Test
    public void testLogoutButtonExists() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Log Out"));
    }

    @Test
    public void testBrowseButtonExists() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Browse Equipment & Make Reservation"));
    }

    @Test
    public void testMyReservationsButtonExists() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "My Reservations"));
    }

    @Test
    public void testBalanceButtonExists() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Balance & Payment History"));
    }

    @Test
    public void testNullUserDoesNotShowAdminButton() {
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp());
        assertNull(GuiAITestSupport.findButton(panel, "Admin / Equipment Management"));
    }

    @Test
    public void testStudentRefreshDoesNotShowAdminButton() {
        Student student = new Student("DB-1", "Student User", new Credentials("dashboard@yorku.ca", "Pass123!"), "CERT");
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp(student));

        panel.refresh();

        assertNull(GuiAITestSupport.findButton(panel, "Admin / Equipment Management"));
    }

    @Test
    public void testManagerRefreshShowsAdminButton() {
        Manager manager = new Manager("DB-2", "Manager User", new Credentials("managerdb@yorku.ca", "Pass123!"), "Engineering");
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp(manager));

        panel.refresh();

        assertNotNull(GuiAITestSupport.findButton(panel, "Admin / Equipment Management"));
    }

    @Test
    public void testRefreshUpdatesWelcomeLabelForLoggedInUser() {
        Manager manager = new Manager("DB-3", "Casey Manager", new Credentials("casey@yorku.ca", "Pass123!"), "Engineering");
        DashboardPanel panel = new DashboardPanel(GuiAITestSupport.bareApp(manager));

        panel.refresh();

        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Welcome, Casey Manager"));
    }
}
