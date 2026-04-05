package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;

import com.yorku.lab.gui.LabReservationApp;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Guest;

public class LabReservationAppAITest {

    @Test
    public void testClassExtendsJFrame() {
        assertTrue(JFrame.class.isAssignableFrom(LabReservationApp.class));
    }

    @Test
    public void testLoginConstantValue() {
        assertEquals("login", LabReservationApp.LOGIN);
    }

    @Test
    public void testRegisterConstantValue() {
        assertEquals("register", LabReservationApp.REGISTER);
    }

    @Test
    public void testDashboardConstantValue() {
        assertEquals("dashboard", LabReservationApp.DASHBOARD);
    }

    @Test
    public void testBrowseConstantValue() {
        assertEquals("browse", LabReservationApp.BROWSE);
    }

    @Test
    public void testMyReservationsConstantValue() {
        assertEquals("my_reservations", LabReservationApp.MY_RESERVATIONS);
    }

    @Test
    public void testBalanceConstantValue() {
        assertEquals("balance", LabReservationApp.BALANCE);
    }

    @Test
    public void testAdminConstantValue() {
        assertEquals("admin", LabReservationApp.ADMIN);
    }

    @Test
    public void testSetCurrentUserUpdatesGetter() {
        LabReservationApp app = GuiAITestSupport.bareApp();
        Guest guest = new Guest("APP-1", "App User", new Credentials("app@yorku.ca", "Pass123!"), "CERT");

        app.setCurrentUser(guest);

        assertEquals(guest, app.getCurrentUser());
    }

    @Test
    public void testOnLogoutClearsCurrentUser() {
        LabReservationApp app = GuiAITestSupport.bareApp();
        Guest guest = new Guest("APP-2", "App User", new Credentials("app2@yorku.ca", "Pass123!"), "CERT");
        app.setCurrentUser(guest);

        app.onLogout();

        assertNull(app.getCurrentUser());
    }

    @Test
    public void testOnLoginSuccessSetsCurrentUser() {
        LabReservationApp app = GuiAITestSupport.bareApp();
        Guest guest = new Guest("APP-3", "App User", new Credentials("app3@yorku.ca", "Pass123!"), "CERT");

        app.onLoginSuccess(guest);

        assertEquals(guest, app.getCurrentUser());
    }

    @Test
    public void testLoginWithCredentialsPrefillsAndDelegatesAttempt() {
        LabReservationApp app = GuiAITestSupport.bareApp();
        GuiAITestSupport.StubLoginPanel stub = new GuiAITestSupport.StubLoginPanel(app);
        GuiAITestSupport.setField(app, "loginPanel", stub);

        app.loginWithCredentials("prefill@yorku.ca", "Pass123!");

        assertTrue(stub.wasAttempted());
    }

    @Test
    public void testBareAppInitializesCardLayoutField() {
        LabReservationApp app = GuiAITestSupport.bareApp();
        assertTrue(GuiAITestSupport.getField(app, "cardLayout", CardLayout.class) instanceof CardLayout);
    }
}
