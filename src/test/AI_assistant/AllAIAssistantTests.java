package test.AI_assistant;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Model tests
import test.AI_assistant.model.ApprovalRequestAITest;
import test.AI_assistant.model.CredentialsAITest;
import test.AI_assistant.model.DepartmentApproverAITest;
import test.AI_assistant.model.EquipmentAITest;
import test.AI_assistant.model.FacultyAITest;
import test.AI_assistant.model.GuestAITest;
import test.AI_assistant.model.LabCoordinatorAITest;
import test.AI_assistant.model.ManagerAITest;
import test.AI_assistant.model.PaymentTransactionAITest;
import test.AI_assistant.model.ReservationAITest;
import test.AI_assistant.model.ResearcherAITest;
import test.AI_assistant.model.StudentAITest;
import test.AI_assistant.model.UsageRecordAITest;

// Repository tests
import test.AI_assistant.repository.ApprovalRequestRepositoryAITest;
import test.AI_assistant.repository.DataBootstrapAITest;
import test.AI_assistant.repository.EquipmentRepositoryAITest;
import test.AI_assistant.repository.PaymentRepositoryAITest;
import test.AI_assistant.repository.RepositoryProviderAITest;
import test.AI_assistant.repository.ReservationRepositoryAITest;
import test.AI_assistant.repository.UserRepositoryAITest;

// Service tests
import test.AI_assistant.service.ArrivalMonitorAITest;
import test.AI_assistant.service.BalanceServiceAITest;
import test.AI_assistant.service.BookingServiceAITest;
import test.AI_assistant.service.EquipmentManagementServiceAITest;
import test.AI_assistant.service.OnboardingNoticeServiceAITest;
import test.AI_assistant.service.PaymentProcessorAITest;
import test.AI_assistant.service.RegistrationServiceAITest;
import test.AI_assistant.service.UsageMonitoringServiceAITest;

// GUI tests
import test.AI_assistant.gui.AdminPanelAITest;
import test.AI_assistant.gui.BalancePanelAITest;
import test.AI_assistant.gui.BrowsePanelAITest;
import test.AI_assistant.gui.DashboardPanelAITest;
import test.AI_assistant.gui.LabReservationAppAITest;
import test.AI_assistant.gui.LoginPanelAITest;
import test.AI_assistant.gui.MyReservationsPanelAITest;
import test.AI_assistant.gui.RegisterPanelAITest;

// Pattern tests - Strategy
import test.AI_assistant.pattern.strategy.CreditPaymentStrategyAITest;
import test.AI_assistant.pattern.strategy.DebitPaymentStrategyAITest;
import test.AI_assistant.pattern.strategy.FacultyPricingStrategyAITest;
import test.AI_assistant.pattern.strategy.GuestPricingStrategyAITest;
import test.AI_assistant.pattern.strategy.InstitutionalPaymentStrategyAITest;
import test.AI_assistant.pattern.strategy.PricingStrategyFactoryAITest;
import test.AI_assistant.pattern.strategy.ResearchGrantPaymentStrategyAITest;
import test.AI_assistant.pattern.strategy.ResearcherPricingStrategyAITest;
import test.AI_assistant.pattern.strategy.StudentPricingStrategyAITest;

// Pattern tests - State
import test.AI_assistant.pattern.state.ReservationStateFactoryAITest;

// Pattern tests - Factory
import test.AI_assistant.pattern.factory.UserFactoryAITest;

// Pattern tests - Singleton
import test.AI_assistant.pattern.singleton.LabCoordinatorServiceAITest;

// Pattern tests - Observer
import test.AI_assistant.pattern.observer.ReservationMonitorObserverAITest;
import test.AI_assistant.pattern.observer.UsageMonitoringObserverAITest;

/**
 * Test suite for all AI-generated tests in the AI_assistant package.
 * This suite aggregates all unit tests created with AI assistance across
 * model, repository, service, GUI, and pattern layers.
 */
@RunWith(Suite.class)
@SuiteClasses({
    // Model tests
    ApprovalRequestAITest.class,
    CredentialsAITest.class,
    DepartmentApproverAITest.class,
    EquipmentAITest.class,
    FacultyAITest.class,
    GuestAITest.class,
    LabCoordinatorAITest.class,
    ManagerAITest.class,
    PaymentTransactionAITest.class,
    ReservationAITest.class,
    ResearcherAITest.class,
    StudentAITest.class,
    UsageRecordAITest.class,
    
    // Repository tests
    ApprovalRequestRepositoryAITest.class,
    DataBootstrapAITest.class,
    EquipmentRepositoryAITest.class,
    PaymentRepositoryAITest.class,
    RepositoryProviderAITest.class,
    ReservationRepositoryAITest.class,
    UserRepositoryAITest.class,
    
    // Service tests
    ArrivalMonitorAITest.class,
    BalanceServiceAITest.class,
    BookingServiceAITest.class,
    EquipmentManagementServiceAITest.class,
    OnboardingNoticeServiceAITest.class,
    PaymentProcessorAITest.class,
    RegistrationServiceAITest.class,
    UsageMonitoringServiceAITest.class,
    
    // GUI tests
    AdminPanelAITest.class,
    BalancePanelAITest.class,
    BrowsePanelAITest.class,
    DashboardPanelAITest.class,
    LabReservationAppAITest.class,
    LoginPanelAITest.class,
    MyReservationsPanelAITest.class,
    RegisterPanelAITest.class,
    
    // Pattern tests - Strategy
    CreditPaymentStrategyAITest.class,
    DebitPaymentStrategyAITest.class,
    FacultyPricingStrategyAITest.class,
    GuestPricingStrategyAITest.class,
    InstitutionalPaymentStrategyAITest.class,
    PricingStrategyFactoryAITest.class,
    ResearchGrantPaymentStrategyAITest.class,
    ResearcherPricingStrategyAITest.class,
    StudentPricingStrategyAITest.class,
    
    // Pattern tests - State
    ReservationStateFactoryAITest.class,
    
    // Pattern tests - Factory
    UserFactoryAITest.class,
    
    // Pattern tests - Singleton
    LabCoordinatorServiceAITest.class,
    
    // Pattern tests - Observer
    ReservationMonitorObserverAITest.class,
    UsageMonitoringObserverAITest.class
})
public class AllAIAssistantTests {
}
