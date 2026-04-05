import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = paymentProcessor0.processPayment((double) (short) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = paymentProcessor0.processPayment(0.0d);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = paymentProcessor0.processPayment((-1.0d));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = paymentProcessor0.processPayment(0.0d);
    }
}

