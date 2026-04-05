package test.AI_assistant.gui;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.time.LocalDateTime;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.junit.Test;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.gui.BrowsePanel;
import com.yorku.lab.model.Credentials;
import com.yorku.lab.model.Researcher;
import com.yorku.lab.model.Student;

public class BrowsePanelAITest {

    @Test
    public void testConstructorCreatesPanel() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        assertNotNull(panel);
    }

    @Test
    public void testUsesBorderLayout() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    @Test
    public void testBackButtonExists() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.findButton(panel, "Back"));
    }

    @Test
    public void testEquipmentComboIsInitialized() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "equipmentCombo", JComboBox.class));
    }

    @Test
    public void testDateSpinnerIsInitialized() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        assertNotNull(GuiAITestSupport.getField(panel, "dateSpinner", JSpinner.class));
    }

    @Test
    public void testStartHourComboHasTwentyFourOptions() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        JComboBox<?> combo = GuiAITestSupport.getField(panel, "startHourCombo", JComboBox.class);
        assertEquals(24, combo.getItemCount());
    }

    @Test
    public void testDurationSpinnerDefaultsToOneHour() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        JSpinner spinner = GuiAITestSupport.getField(panel, "durationSpinner", JSpinner.class);
        assertEquals(1, spinner.getValue());
    }

    @Test
    public void testDurationSpinnerUsesOneToEightRange() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        JSpinner spinner = GuiAITestSupport.getField(panel, "durationSpinner", JSpinner.class);
        SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
        assertEquals(1, model.getMinimum());
        assertEquals(8, model.getMaximum());
    }

    @Test
    public void testPaymentMethodComboStartsWithAllEnumValues() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());
        JComboBox<?> combo = GuiAITestSupport.getField(panel, "paymentMethodCombo", JComboBox.class);
        assertEquals(PaymentMethod.values().length, combo.getItemCount());
    }

    @Test
    public void testRefreshWithNullUserClearsPaymentMethods() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());

        panel.refresh();

        JComboBox<?> combo = GuiAITestSupport.getField(panel, "paymentMethodCombo", JComboBox.class);
        assertEquals(0, combo.getItemCount());
    }

    @Test
    public void testRefreshSelectsAValidHour() {
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp());

        panel.refresh();

        JComboBox<?> combo = GuiAITestSupport.getField(panel, "startHourCombo", JComboBox.class);
        assertTrue(combo.getSelectedIndex() >= 0 && combo.getSelectedIndex() < 24);
    }

    @Test
    public void testStudentRefreshIncludesInstitutionalButNotGrants() {
        Student student = new Student("BR-1", "Browse Student", new Credentials("student@yorku.ca", "Pass123!"), "CERT");
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp(student));

        panel.refresh();

        JComboBox<?> combo = GuiAITestSupport.getField(panel, "paymentMethodCombo", JComboBox.class);
        assertEquals(3, combo.getItemCount());
        assertEquals(PaymentMethod.CREDIT, combo.getItemAt(0));
        assertEquals(PaymentMethod.DEBIT, combo.getItemAt(1));
        assertEquals(PaymentMethod.INSTITUTIONAL, combo.getItemAt(2));
    }

    @Test
    public void testResearcherRefreshIncludesGrants() {
        Researcher researcher = new Researcher("BR-2", "Browse Researcher", new Credentials("researcher@yorku.ca", "Pass123!"), "CERT");
        BrowsePanel panel = new BrowsePanel(GuiAITestSupport.bareApp(researcher));

        panel.refresh();

        JComboBox<?> combo = GuiAITestSupport.getField(panel, "paymentMethodCombo", JComboBox.class);
        assertEquals(4, combo.getItemCount());
        assertEquals(PaymentMethod.GRANTS, combo.getItemAt(3));
    }
}
