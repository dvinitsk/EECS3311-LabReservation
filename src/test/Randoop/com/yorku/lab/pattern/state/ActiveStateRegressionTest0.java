package test.Randoop.com.yorku.lab.pattern.state;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ActiveStateRegressionTest0 {

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
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        java.lang.Class<?> wildcardClass1 = activeState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeState0.complete(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.setStatus(com.yorku.lab.enums.BookingStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeState0.markNoShow(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.setStatus(com.yorku.lab.enums.BookingStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        com.yorku.lab.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeState0.extend(reservation1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.setEndTime(java.time.LocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeState0.cancel(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a reservation that is already active.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeState0.markArrived(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.setArrived(boolean)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        com.yorku.lab.pattern.state.ActiveState activeState0 = new com.yorku.lab.pattern.state.ActiveState();
        com.yorku.lab.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeState0.modify(reservation1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a reservation that is already active.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }
}

