package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import org.junit.Test;

import com.yorku.lab.gui.AdminPanel;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Manager;

public class AdminPanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testContainsTabbedPane() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findFirst(panel, JTabbedPane.class));
    }

    @Test
    public void testHasThreeTabs() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        JTabbedPane tabs = GuiAITestSupport.getField(panel, "tabs", JTabbedPane.class);
        assertEquals(3, tabs.getTabCount());
    }

    @Test
    public void testApprovalTabExists() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        JTabbedPane tabs = GuiAITestSupport.getField(panel, "tabs", JTabbedPane.class);
        assertEquals("Account Approvals", tabs.getTitleAt(0));
    }

    @Test
    public void testCreateManagerTabExists() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        JTabbedPane tabs = GuiAITestSupport.getField(panel, "tabs", JTabbedPane.class);
        assertEquals("Create Manager", tabs.getTitleAt(1));
    }

    @Test
    public void testEquipmentTabExists() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        JTabbedPane tabs = GuiAITestSupport.getField(panel, "tabs", JTabbedPane.class);
        assertEquals("Equipment Management", tabs.getTitleAt(2));
    }

    @Test
    public void testBackButtonExists() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Back"));
    }

    @Test
    public void testCreateManagerButtonExists() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Create Lab Manager Account"));
    }

    @Test
    public void testCreateManagerFormHasThreeTextFields() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        assertEquals(3, GuiAITestSupport.countComponents(panel, JTextField.class));
    }

    @Test
    public void testRefreshWithNoUserDoesNotPopulatePanels() {
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp());
        panel.refresh();

        assertEquals(0, GuiAITestSupport.getField(panel, "approvalPanel", javax.swing.JPanel.class).getComponentCount());
        assertEquals(0, GuiAITestSupport.getField(panel, "equipmentPanel", javax.swing.JPanel.class).getComponentCount());
    }

    @Test
    public void testRefreshWithManagerBuildsEquipmentSection() {
        Manager manager = new Manager("ADM-1", "Admin User", new Credentials("admin@yorku.ca", "Pass123!"), "Engineering");
        AdminPanel panel = new AdminPanel(GuiAITestSupport.bareApp(manager));

        panel.refresh();

        assertTrue(GuiAITestSupport.getField(panel, "equipmentPanel", javax.swing.JPanel.class).getComponentCount() > 0);
    }
}
