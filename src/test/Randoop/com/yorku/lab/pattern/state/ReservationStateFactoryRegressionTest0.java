package test.Randoop.com.yorku.lab.pattern.state;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationStateFactoryRegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.yorku.lab.pattern.state.ReservationStateFactory reservationStateFactory0 = new com.yorku.lab.pattern.state.ReservationStateFactory();
        java.lang.Class<?> wildcardClass1 = reservationStateFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.yorku.lab.enums.BookingStatus bookingStatus0 = null;
        com.yorku.lab.pattern.state.ReservationState reservationState1 = com.yorku.lab.pattern.state.ReservationStateFactory.fromStatus(bookingStatus0);
        java.lang.Class<?> wildcardClass2 = reservationState1.getClass();
        org.junit.Assert.assertNotNull(reservationState1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

