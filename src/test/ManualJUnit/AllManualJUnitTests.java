package test.ManualJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Model tests
import test.ManualJUnit.model.ApprovalRequestTest;
import test.ManualJUnit.model.CredentialsTest;
import test.ManualJUnit.model.DepartmentApproverTest;
import test.ManualJUnit.model.EquipmentTest;
import test.ManualJUnit.model.FacultyTest;
import test.ManualJUnit.model.GuestTest;
import test.ManualJUnit.model.LabCoordinatorTest;
import test.ManualJUnit.model.ManagerTest;
import test.ManualJUnit.model.PaymentTransactionTest;
import test.ManualJUnit.model.ReservationTest;
import test.ManualJUnit.model.ResearcherTest;
import test.ManualJUnit.model.StudentTest;
import test.ManualJUnit.model.UsageRecordTest;

// Repository tests
import test.ManualJUnit.repository.ApprovalRequestRepositoryTest;
import test.ManualJUnit.repository.DataBootstrapTest;
import test.ManualJUnit.repository.EquipmentRepositoryTest;
import test.ManualJUnit.repository.PaymentRepositoryTest;
import test.ManualJUnit.repository.RepositoryProviderTest;
import test.ManualJUnit.repository.ReservationRepositoryTest;
import test.ManualJUnit.repository.UserRepositoryTest;

// Service tests
import test.ManualJUnit.service.ArrivalMonitorTest;
import test.ManualJUnit.service.BalanceServiceTest;
import test.ManualJUnit.service.BookingServiceTest;
import test.ManualJUnit.service.EquipmentManagementServiceTest;
import test.ManualJUnit.service.PaymentProcessorTest;
import test.ManualJUnit.service.RegistrationServiceTest;
import test.ManualJUnit.service.UsageMonitoringServiceTest;

// Pattern tests - Strategy
import test.ManualJUnit.pattern.strategy.CreditPaymentStrategyTest;
import test.ManualJUnit.pattern.strategy.DebitPaymentStrategyTest;
import test.ManualJUnit.pattern.strategy.FacultyPricingStrategyTest;
import test.ManualJUnit.pattern.strategy.GuestPricingStrategyTest;
import test.ManualJUnit.pattern.strategy.InstitutionalPaymentStrategyTest;
import test.ManualJUnit.pattern.strategy.PricingStrategyFactoryTest;
import test.ManualJUnit.pattern.strategy.ResearchGrantPaymentStrategyTest;
import test.ManualJUnit.pattern.strategy.ResearcherPricingStrategyTest;
import test.ManualJUnit.pattern.strategy.StudentPricingStrategyTest;

// Pattern tests - State
import test.ManualJUnit.pattern.state.ActiveStateTest;
import test.ManualJUnit.pattern.state.ArrivedStateTest;
import test.ManualJUnit.pattern.state.CancelledStateTest;
import test.ManualJUnit.pattern.state.CompletedStateTest;
import test.ManualJUnit.pattern.state.ConfirmedStateTest;
import test.ManualJUnit.pattern.state.ExtendedStateTest;
import test.ManualJUnit.pattern.state.ModifiedStateTest;
import test.ManualJUnit.pattern.state.NoShowStateTest;
import test.ManualJUnit.pattern.state.ReservationStateFactoryTest;

// Pattern tests - Factory
import test.ManualJUnit.pattern.factory.UserFactoryTest;

// Pattern tests - Singleton
import test.ManualJUnit.pattern.singleton.LabCoordinatorServiceTest;
import test.ManualJUnit.pattern.observer.ReservationMonitorObserverTest;
import test.ManualJUnit.pattern.observer.SensorObserverInterfaceTest;
import test.ManualJUnit.pattern.observer.SensorSubjectInterfaceTest;
// Pattern tests - Observer
import test.ManualJUnit.pattern.observer.SensorSystemTest;
import test.ManualJUnit.pattern.observer.UsageMonitoringObserverTest;

// Pattern tests - Facade
import test.ManualJUnit.pattern.facade.ReservationFacadeTest;

/**
 * Test suite for all manual JUnit tests in the ManualJUnit package.
 * This suite aggregates all unit tests created manually across
 * model, repository, service, and pattern layers.
 */
@RunWith(Suite.class)
@SuiteClasses({
    // Model tests
    ApprovalRequestTest.class,
    CredentialsTest.class,
    DepartmentApproverTest.class,
    EquipmentTest.class,
    FacultyTest.class,
    GuestTest.class,
    LabCoordinatorTest.class,
    ManagerTest.class,
    PaymentTransactionTest.class,
    ReservationTest.class,
    ResearcherTest.class,
    StudentTest.class,
    UsageRecordTest.class,
    
    // Repository tests
    ApprovalRequestRepositoryTest.class,
    DataBootstrapTest.class,
    EquipmentRepositoryTest.class,
    PaymentRepositoryTest.class,
    RepositoryProviderTest.class,
    ReservationRepositoryTest.class,
    UserRepositoryTest.class,
    
    // Service tests
    ArrivalMonitorTest.class,
    BalanceServiceTest.class,
    BookingServiceTest.class,
    EquipmentManagementServiceTest.class,
    PaymentProcessorTest.class,
    RegistrationServiceTest.class,
    UsageMonitoringServiceTest.class,
    
    // Pattern tests - Strategy
    CreditPaymentStrategyTest.class,
    DebitPaymentStrategyTest.class,
    FacultyPricingStrategyTest.class,
    GuestPricingStrategyTest.class,
    InstitutionalPaymentStrategyTest.class,
    PricingStrategyFactoryTest.class,
    ResearchGrantPaymentStrategyTest.class,
    ResearcherPricingStrategyTest.class,
    StudentPricingStrategyTest.class,
    
    // Pattern tests - State
    ActiveStateTest.class,
    ArrivedStateTest.class,
    CancelledStateTest.class,
    CompletedStateTest.class,
    ConfirmedStateTest.class,
    ExtendedStateTest.class,
    ModifiedStateTest.class,
    NoShowStateTest.class,
    ReservationStateFactoryTest.class,
    
    // Pattern tests - Factory
    UserFactoryTest.class,
    
    // Pattern tests - Singleton
    LabCoordinatorServiceTest.class,
    
    // Pattern tests - Observer
    SensorSystemTest.class,
    UsageMonitoringObserverTest.class,
    ReservationMonitorObserverTest.class,
    SensorObserverInterfaceTest.class,
    SensorSubjectInterfaceTest.class,
    
    // Pattern tests - Facade
    ReservationFacadeTest.class
})
public class AllManualJUnitTests {
}
