package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

import org.junit.Test;

import com.yorku.lab.gui.BalancePanel;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Guest;

public class BalancePanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testBackButtonExists() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Back"));
    }

    @Test
    public void testTitleLabelExists() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Balance & Payment History"));
    }

    @Test
    public void testContainsScrollPane() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findFirst(panel, JScrollPane.class));
    }

    @Test
    public void testContentPanelIsInitialized() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "contentPanel", JPanel.class));
    }

    @Test
    public void testRefreshWithNoUserLeavesContentEmpty() {
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp());
        panel.refresh();

        assertEquals(0, GuiAITestSupport.getField(panel, "contentPanel", JPanel.class).getComponentCount());
    }

    @Test
    public void testRefreshWithUserAddsSummaryComponents() {
        Guest guest = new Guest("BAL-1", "Balance User", new Credentials("bal@yorku.ca", "Pass123!"), "CERT");
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();

        assertEquals(2, GuiAITestSupport.getField(panel, "contentPanel", JPanel.class).getComponentCount());
    }

    @Test
    public void testRefreshWithUserShowsTotalPaidLabel() {
        Guest guest = new Guest("BAL-2", "Balance User", new Credentials("bal2@yorku.ca", "Pass123!"), "CERT");
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();

        assertNotNull(GuiAITestSupport.findLabelContaining(panel, "Total Paid: $0.00"));
    }

    @Test
    public void testRefreshWithUserAddsSeparator() {
        Guest guest = new Guest("BAL-3", "Balance User", new Credentials("bal3@yorku.ca", "Pass123!"), "CERT");
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();

        assertEquals(1, GuiAITestSupport.countComponents(panel, JSeparator.class));
    }

    @Test
    public void testSecondRefreshKeepsTwoSummaryComponents() {
        Guest guest = new Guest("BAL-4", "Balance User", new Credentials("bal4@yorku.ca", "Pass123!"), "CERT");
        BalancePanel panel = new BalancePanel(GuiAITestSupport.bareApp(guest));

        panel.refresh();
        panel.refresh();

        assertEquals(2, GuiAITestSupport.getField(panel, "contentPanel", JPanel.class).getComponentCount());
    }
}
