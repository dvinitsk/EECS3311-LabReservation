package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import com.yorku.lab.gui.LoginPanel;

public class LoginPanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testTitleLabelExists() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "YorkU Lab Equipment Reservation"));
    }

    @Test
    public void testEmailLabelExists() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Email:"));
    }

    @Test
    public void testPasswordLabelExists() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Password:"));
    }

    @Test
    public void testLoginButtonExists() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Log In"));
    }

    @Test
    public void testRegisterButtonExists() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Register"));
    }

    @Test
    public void testSetCredentialsStoresEmail() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        panel.setCredentials("login@yorku.ca", "Pass123!");

        JTextField emailField = GuiAITestSupport.getField(panel, "emailField", JTextField.class);
        assertEquals("login@yorku.ca", emailField.getText());
    }

    @Test
    public void testSetCredentialsStoresPassword() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        panel.setCredentials("login@yorku.ca", "Pass123!");

        JPasswordField passwordField = GuiAITestSupport.getField(panel, "passwordField", JPasswordField.class);
        assertEquals("Pass123!", new String(passwordField.getPassword()));
    }

    @Test
    public void testSetCredentialsNullClearsFields() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        panel.setCredentials(null, null);

        JTextField emailField = GuiAITestSupport.getField(panel, "emailField", JTextField.class);
        JPasswordField passwordField = GuiAITestSupport.getField(panel, "passwordField", JPasswordField.class);
        assertEquals("", emailField.getText());
        assertEquals("", new String(passwordField.getPassword()));
    }

    @Test
    public void testHasTwoInputFields() {
        LoginPanel panel = new LoginPanel(GuiAITestSupport.bareApp());
        assertEquals(2, GuiAITestSupport.countComponents(panel, JTextField.class));
    }
}
