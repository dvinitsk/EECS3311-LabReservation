package test.Randoop.com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationRegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markNoShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markNoShow(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Arrival window has already passed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        boolean boolean13 = reservation5.isArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markNoShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markNoShow(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.modify(com.yorku.lab.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a reservation that has not started yet.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a reservation that is only confirmed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = reservation5.getCurrentState();
        java.lang.Class<?> wildcardClass8 = reservationState7.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(reservationState7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        reservation5.addPayment(paymentTransaction8);
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = reservation5.getPayments();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList19);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.lang.String str7 = reservation5.getReservationId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = reservation5.getPayments();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.extend(com.yorku.lab.model.Reservation, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation already marked as no-show.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        reservation5.addPayment(paymentTransaction9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.complete(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        java.time.LocalDateTime localDateTime9 = reservation5.getStartTime();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        reservation5.setArrived(false);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getStartTime();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.modify(localDateTime8, localDateTime9);
        reservation5.markArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a reservation that is already in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = reservation5.getPayments();
        java.lang.String str10 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.complete(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.markArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markNoShow();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: User has already arrived.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.markArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a reservation that is already in use.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Arrival window has already passed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = reservation5.getPayments();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a reservation that is only confirmed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        boolean boolean13 = reservation5.isArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markArrived(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        boolean boolean13 = reservation5.isArrived();
        reservation5.setArrived(false);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.modify(localDateTime8, localDateTime9);
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markNoShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markNoShow(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        boolean boolean8 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a reservation that has not started yet.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.enums.BookingStatus bookingStatus6 = reservation5.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus6.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.Equipment equipment15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.lab.model.Reservation reservation18 = new com.yorku.lab.model.Reservation("hi!", user14, equipment15, localDateTime16, localDateTime17);
        reservation18.markNoShow();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.Equipment equipment22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.lab.model.Reservation reservation25 = new com.yorku.lab.model.Reservation("", user21, equipment22, localDateTime23, localDateTime24);
        com.yorku.lab.pattern.state.ReservationState reservationState26 = reservation25.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState27 = null;
        reservation25.setState(reservationState27);
        com.yorku.lab.model.User user29 = reservation25.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus30 = reservation25.getStatus();
        reservation18.setStatus(bookingStatus30);
        reservation5.setStatus(bookingStatus30);
        java.time.LocalDateTime localDateTime33 = null;
        reservation5.setEndTime(localDateTime33);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(reservationState26);
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus30.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.extend(com.yorku.lab.model.Reservation, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation already marked as no-show.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = reservation5.getPayments();
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        reservation5.addPayment(paymentTransaction9);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        reservation5.setArrived(true);
        com.yorku.lab.enums.BookingStatus bookingStatus16 = reservation5.getStatus();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation5.getStatus();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(bookingStatus16);
        org.junit.Assert.assertNull(bookingStatus17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        reservation5.setArrived(false);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        reservation5.cancel();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = null;
        reservation5.setStatus(bookingStatus10);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        reservation5.setArrived(false);
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a reservation that is only confirmed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.modify(localDateTime8, localDateTime9);
        reservation5.markArrived();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        reservation5.addPayment(paymentTransaction8);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        java.time.LocalDateTime localDateTime13 = reservation5.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.markArrived();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extend(localDateTime9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        reservation5.setArrived(true);
        com.yorku.lab.enums.BookingStatus bookingStatus16 = reservation5.getStatus();
        com.yorku.lab.model.User user17 = reservation5.getUser();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(bookingStatus16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        reservation5.setArrived(true);
        java.time.LocalDateTime localDateTime16 = reservation5.getStartTime();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus9 = reservation5.getStatus();
        java.lang.Class<?> wildcardClass10 = bookingStatus9.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.lab.enums.BookingStatus.NO_SHOW + "'", bookingStatus9.equals(com.yorku.lab.enums.BookingStatus.NO_SHOW));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.modify(localDateTime9, localDateTime10);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        boolean boolean13 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime14 = reservation5.getStartTime();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = reservation5.getPayments();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.Equipment equipment22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.lab.model.Reservation reservation25 = new com.yorku.lab.model.Reservation("", user21, equipment22, localDateTime23, localDateTime24);
        com.yorku.lab.pattern.state.ReservationState reservationState26 = reservation25.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState27 = reservation25.getCurrentState();
        reservation5.setState(reservationState27);
        java.lang.String str29 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(reservationState26);
        org.junit.Assert.assertNotNull(reservationState27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.Equipment equipment8 = reservation5.getEquipment();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(equipment8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        boolean boolean8 = reservation5.isArrived();
        reservation5.setArrived(true);
        boolean boolean11 = reservation5.isArrived();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = reservation5.getCurrentState();
        reservation5.cancel();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(reservationState7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markNoShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markNoShow(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        boolean boolean9 = reservation5.isArrived();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.modify(localDateTime8, localDateTime9);
        reservation5.markNoShow();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setEndTime(localDateTime9);
        java.lang.String str11 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markArrived(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        com.yorku.lab.enums.BookingStatus bookingStatus7 = reservation5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus7.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setEndTime(localDateTime7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.complete(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = reservation5.getPayments();
        java.lang.String str9 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus9 = reservation5.getStatus();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setStartTime(localDateTime11);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.lab.enums.BookingStatus.NO_SHOW + "'", bookingStatus9.equals(com.yorku.lab.enums.BookingStatus.NO_SHOW));
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        boolean boolean9 = reservation5.isArrived();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = reservation5.getPayments();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.modify(localDateTime7, localDateTime8);
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.MODIFIED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.MODIFIED));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setEndTime(localDateTime9);
        reservation5.markNoShow();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        reservation5.cancel();
        boolean boolean8 = reservation5.isArrived();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = reservation5.getPayments();
        boolean boolean10 = reservation5.isArrived();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.User user6 = reservation5.getUser();
        java.lang.String str7 = reservation5.getReservationId();
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        com.yorku.lab.model.User user11 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState12 = null;
        reservation5.setState(reservationState12);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        reservation5.cancel();
        boolean boolean8 = reservation5.isArrived();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a reservation that has not started yet.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.lang.String str8 = reservation5.getReservationId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        reservation5.addPayment(paymentTransaction8);
        com.yorku.lab.model.Equipment equipment10 = reservation5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Arrival window has already passed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setEndTime(localDateTime7);
        java.lang.String str9 = reservation5.getReservationId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        boolean boolean16 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.modify(com.yorku.lab.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        boolean boolean8 = reservation5.isArrived();
        reservation5.setArrived(true);
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a reservation that has not started yet.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = reservation5.getEndTime();
        java.lang.String str8 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        com.yorku.lab.enums.BookingStatus bookingStatus8 = reservation5.getStatus();
        java.lang.String str9 = reservation5.getReservationId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus8.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        com.yorku.lab.enums.BookingStatus bookingStatus12 = null;
        reservation5.setStatus(bookingStatus12);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = reservation5.getEndTime();
        com.yorku.lab.pattern.state.ReservationState reservationState8 = reservation5.getCurrentState();
        java.lang.String str9 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNotNull(reservationState8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = reservation5.getPayments();
        com.yorku.lab.model.PaymentTransaction paymentTransaction20 = null;
        reservation5.addPayment(paymentTransaction20);
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        boolean boolean9 = reservation5.isArrived();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        reservation5.cancel();
        reservation5.setArrived(true);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = reservation5.getPayments();
        java.lang.Class<?> wildcardClass20 = paymentTransactionList19.getClass();
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.Equipment equipment10 = reservation5.getEquipment();
        com.yorku.lab.model.User user11 = reservation5.getUser();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        com.yorku.lab.enums.BookingStatus bookingStatus7 = reservation5.getStatus();
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus7.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        reservation5.setArrived(false);
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.Equipment equipment13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        com.yorku.lab.model.Reservation reservation16 = new com.yorku.lab.model.Reservation("hi!", user12, equipment13, localDateTime14, localDateTime15);
        com.yorku.lab.model.Equipment equipment17 = reservation16.getEquipment();
        boolean boolean18 = reservation16.isArrived();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = reservation16.getPayments();
        com.yorku.lab.enums.BookingStatus bookingStatus20 = reservation16.getStatus();
        reservation5.setStatus(bookingStatus20);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(equipment17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus20.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.modify(localDateTime8, localDateTime9);
        com.yorku.lab.pattern.state.ReservationState reservationState11 = reservation5.getCurrentState();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reservationState11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        com.yorku.lab.model.Equipment equipment12 = reservation5.getEquipment();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        reservation5.markNoShow();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        reservation5.cancel();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.markArrived();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.extend(localDateTime9);
        java.time.LocalDateTime localDateTime11 = reservation5.getStartTime();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.Equipment equipment15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.lab.model.Reservation reservation18 = new com.yorku.lab.model.Reservation("hi!", user14, equipment15, localDateTime16, localDateTime17);
        reservation18.markNoShow();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.Equipment equipment22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.lab.model.Reservation reservation25 = new com.yorku.lab.model.Reservation("", user21, equipment22, localDateTime23, localDateTime24);
        com.yorku.lab.pattern.state.ReservationState reservationState26 = reservation25.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState27 = null;
        reservation25.setState(reservationState27);
        com.yorku.lab.model.User user29 = reservation25.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus30 = reservation25.getStatus();
        reservation18.setStatus(bookingStatus30);
        reservation5.setStatus(bookingStatus30);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.modify(localDateTime33, localDateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.modify(com.yorku.lab.model.Reservation, java.time.LocalDateTime, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(reservationState26);
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus30.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        java.time.LocalDateTime localDateTime13 = reservation5.getEndTime();
        java.lang.String str14 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        com.yorku.lab.model.User user12 = reservation5.getUser();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = reservation5.getPayments();
        reservation5.setArrived(false);
        java.lang.String str22 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setStartTime(localDateTime9);
        java.time.LocalDateTime localDateTime11 = reservation5.getEndTime();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = reservation5.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.enums.BookingStatus bookingStatus8 = reservation5.getStatus();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.lab.enums.BookingStatus.NO_SHOW + "'", bookingStatus8.equals(com.yorku.lab.enums.BookingStatus.NO_SHOW));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        reservation5.setArrived(false);
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.extend(com.yorku.lab.model.Reservation, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        reservation5.cancel();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot mark arrival on a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        boolean boolean8 = reservation5.isArrived();
        reservation5.setArrived(true);
        com.yorku.lab.model.User user11 = reservation5.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        boolean boolean8 = reservation5.isArrived();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = reservation5.getCurrentState();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(reservationState9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = reservation5.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Arrival window has already passed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.time.LocalDateTime localDateTime11 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.Equipment equipment15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        com.yorku.lab.model.Reservation reservation18 = new com.yorku.lab.model.Reservation("hi!", user14, equipment15, localDateTime16, localDateTime17);
        reservation18.markNoShow();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.Equipment equipment22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        com.yorku.lab.model.Reservation reservation25 = new com.yorku.lab.model.Reservation("", user21, equipment22, localDateTime23, localDateTime24);
        com.yorku.lab.pattern.state.ReservationState reservationState26 = reservation25.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState27 = null;
        reservation25.setState(reservationState27);
        com.yorku.lab.model.User user29 = reservation25.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus30 = reservation25.getStatus();
        reservation18.setStatus(bookingStatus30);
        reservation5.setStatus(bookingStatus30);
        java.time.LocalDateTime localDateTime33 = null;
        reservation5.setStartTime(localDateTime33);
        java.time.LocalDateTime localDateTime35 = reservation5.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.complete(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(reservationState26);
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus30.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(localDateTime35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setEndTime(localDateTime9);
        reservation5.markNoShow();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a no-show reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        reservation5.addPayment(paymentTransaction9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = reservation5.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.lab.enums.BookingStatus.CANCELLED + "'", bookingStatus11.equals(com.yorku.lab.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setStartTime(localDateTime10);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        com.yorku.lab.model.Equipment equipment14 = reservation5.getEquipment();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        reservation5.setArrived(true);
        java.time.LocalDateTime localDateTime16 = reservation5.getEndTime();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = reservation5.getPayments();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = reservation5.getPayments();
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        java.lang.Class<?> wildcardClass19 = bookingStatus17.getClass();
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.modify(localDateTime9, localDateTime10);
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        com.yorku.lab.model.Equipment equipment12 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation5.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.extend(com.yorku.lab.model.Reservation, java.time.LocalDateTime)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        reservation5.cancel();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = reservation5.getPayments();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = reservation5.getCurrentState();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(reservationState14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.modify(localDateTime7, localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot complete a reservation that has not started.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.time.LocalDateTime localDateTime9 = reservation5.getEndTime();
        com.yorku.lab.pattern.state.ReservationState reservationState10 = null;
        reservation5.setState(reservationState10);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        boolean boolean6 = reservation5.isArrived();
        reservation5.markNoShow();
        boolean boolean8 = reservation5.isArrived();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = reservation5.getCurrentState();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationState9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        reservation5.cancel();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        reservation5.setArrived(true);
        com.yorku.lab.enums.BookingStatus bookingStatus16 = reservation5.getStatus();
        com.yorku.lab.model.User user17 = reservation5.getUser();
        com.yorku.lab.model.User user19 = null;
        com.yorku.lab.model.Equipment equipment20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        com.yorku.lab.model.Reservation reservation23 = new com.yorku.lab.model.Reservation("", user19, equipment20, localDateTime21, localDateTime22);
        com.yorku.lab.pattern.state.ReservationState reservationState24 = reservation23.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState25 = null;
        reservation23.setState(reservationState25);
        com.yorku.lab.model.User user27 = reservation23.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus28 = reservation23.getStatus();
        reservation5.setStatus(bookingStatus28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = reservation5.getPayments();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(bookingStatus16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(reservationState24);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus28.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.enums.BookingStatus bookingStatus11 = null;
        reservation5.setStatus(bookingStatus11);
        com.yorku.lab.enums.BookingStatus bookingStatus13 = reservation5.getStatus();
        reservation5.setArrived(true);
        com.yorku.lab.enums.BookingStatus bookingStatus16 = reservation5.getStatus();
        com.yorku.lab.model.User user17 = reservation5.getUser();
        com.yorku.lab.model.User user19 = null;
        com.yorku.lab.model.Equipment equipment20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        com.yorku.lab.model.Reservation reservation23 = new com.yorku.lab.model.Reservation("", user19, equipment20, localDateTime21, localDateTime22);
        com.yorku.lab.pattern.state.ReservationState reservationState24 = reservation23.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState25 = null;
        reservation23.setState(reservationState25);
        com.yorku.lab.model.User user27 = reservation23.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus28 = reservation23.getStatus();
        reservation5.setStatus(bookingStatus28);
        java.lang.String str30 = reservation5.getReservationId();
        boolean boolean31 = reservation5.isArrived();
        java.time.LocalDateTime localDateTime32 = reservation5.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.cancel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.cancel(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(bookingStatus16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(reservationState24);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus28.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDateTime32);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        com.yorku.lab.model.User user11 = reservation5.getUser();
        com.yorku.lab.model.Equipment equipment12 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime13 = reservation5.getEndTime();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        reservation5.setArrived(false);
        com.yorku.lab.model.User user11 = reservation5.getUser();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user9 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        com.yorku.lab.model.User user11 = reservation5.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = user11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        java.lang.String str16 = reservation5.getReservationId();
        com.yorku.lab.model.User user18 = null;
        com.yorku.lab.model.Equipment equipment19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        com.yorku.lab.model.Reservation reservation22 = new com.yorku.lab.model.Reservation("hi!", user18, equipment19, localDateTime20, localDateTime21);
        reservation22.markNoShow();
        com.yorku.lab.model.User user25 = null;
        com.yorku.lab.model.Equipment equipment26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        com.yorku.lab.model.Reservation reservation29 = new com.yorku.lab.model.Reservation("", user25, equipment26, localDateTime27, localDateTime28);
        com.yorku.lab.pattern.state.ReservationState reservationState30 = reservation29.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState31 = null;
        reservation29.setState(reservationState31);
        com.yorku.lab.model.User user33 = reservation29.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus34 = reservation29.getStatus();
        reservation22.setStatus(bookingStatus34);
        com.yorku.lab.model.User user37 = null;
        com.yorku.lab.model.Equipment equipment38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        com.yorku.lab.model.Reservation reservation41 = new com.yorku.lab.model.Reservation("", user37, equipment38, localDateTime39, localDateTime40);
        com.yorku.lab.pattern.state.ReservationState reservationState42 = reservation41.getCurrentState();
        reservation41.markNoShow();
        com.yorku.lab.model.User user44 = reservation41.getUser();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = reservation41.getPayments();
        com.yorku.lab.pattern.state.ReservationState reservationState46 = reservation41.getCurrentState();
        reservation22.setState(reservationState46);
        reservation5.setState(reservationState46);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(reservationState30);
        org.junit.Assert.assertNull(user33);
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus34.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(reservationState42);
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(reservationState46);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus9 = reservation5.getStatus();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = reservation5.getPayments();
        com.yorku.lab.pattern.state.ReservationState reservationState11 = null;
        reservation5.setState(reservationState11);
        reservation5.setArrived(false);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + com.yorku.lab.enums.BookingStatus.NO_SHOW + "'", bookingStatus9.equals(com.yorku.lab.enums.BookingStatus.NO_SHOW));
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime10 = reservation5.getEndTime();
        java.time.LocalDateTime localDateTime11 = null;
        reservation5.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation5.getStartTime();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        com.yorku.lab.model.User user16 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState17 = null;
        reservation5.setState(reservationState17);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        reservation5.setArrived(false);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.modify(localDateTime7, localDateTime8);
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        reservation5.cancel();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.MODIFIED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.MODIFIED));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.time.LocalDateTime localDateTime9 = reservation5.getEndTime();
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        reservation5.addPayment(paymentTransaction10);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        com.yorku.lab.model.Equipment equipment11 = reservation5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markNoShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.markNoShow(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setEndTime(localDateTime9);
        reservation5.markNoShow();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = reservation5.getPayments();
        com.yorku.lab.model.Equipment equipment13 = reservation5.getEquipment();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        com.yorku.lab.model.Reservation reservation12 = new com.yorku.lab.model.Reservation("", user8, equipment9, localDateTime10, localDateTime11);
        com.yorku.lab.pattern.state.ReservationState reservationState13 = reservation12.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState14 = null;
        reservation12.setState(reservationState14);
        com.yorku.lab.model.User user16 = reservation12.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus17 = reservation12.getStatus();
        reservation5.setStatus(bookingStatus17);
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = null;
        reservation5.addPayment(paymentTransaction19);
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        java.lang.String str7 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation5.setEndTime(localDateTime10);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        reservation5.markArrived();
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        boolean boolean10 = reservation5.isArrived();
        boolean boolean11 = reservation5.isArrived();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = reservation5.getPayments();
        com.yorku.lab.enums.BookingStatus bookingStatus10 = reservation5.getStatus();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.NO_SHOW + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.NO_SHOW));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = reservation5.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.complete(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        com.yorku.lab.enums.BookingStatus bookingStatus8 = reservation5.getStatus();
        com.yorku.lab.model.User user9 = reservation5.getUser();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus8.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        java.lang.String str8 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setStartTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        reservation5.setEndTime(localDateTime9);
        reservation5.cancel();
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        boolean boolean8 = reservation5.isArrived();
        boolean boolean9 = reservation5.isArrived();
        java.lang.String str10 = reservation5.getReservationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.Equipment equipment9 = reservation5.getEquipment();
        java.time.LocalDateTime localDateTime10 = reservation5.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.markArrived();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot mark arrival on a cancelled reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        com.yorku.lab.model.Equipment equipment7 = reservation5.getEquipment();
        reservation5.markNoShow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(equipment7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        reservation5.cancel();
        com.yorku.lab.model.User user10 = null;
        com.yorku.lab.model.Equipment equipment11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.lab.model.Reservation reservation14 = new com.yorku.lab.model.Reservation("hi!", user10, equipment11, localDateTime12, localDateTime13);
        com.yorku.lab.model.Equipment equipment15 = reservation14.getEquipment();
        java.lang.String str16 = reservation14.getReservationId();
        java.time.LocalDateTime localDateTime17 = reservation14.getStartTime();
        com.yorku.lab.model.User user19 = null;
        com.yorku.lab.model.Equipment equipment20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        com.yorku.lab.model.Reservation reservation23 = new com.yorku.lab.model.Reservation("", user19, equipment20, localDateTime21, localDateTime22);
        com.yorku.lab.pattern.state.ReservationState reservationState24 = reservation23.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState25 = null;
        reservation23.setState(reservationState25);
        com.yorku.lab.pattern.state.ReservationState reservationState27 = null;
        reservation23.setState(reservationState27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = reservation23.getPayments();
        java.time.LocalDateTime localDateTime30 = null;
        reservation23.setStartTime(localDateTime30);
        java.time.LocalDateTime localDateTime32 = null;
        reservation23.setEndTime(localDateTime32);
        java.time.LocalDateTime localDateTime34 = reservation23.getStartTime();
        java.time.LocalDateTime localDateTime35 = reservation23.getStartTime();
        com.yorku.lab.model.User user37 = null;
        com.yorku.lab.model.Equipment equipment38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        com.yorku.lab.model.Reservation reservation41 = new com.yorku.lab.model.Reservation("", user37, equipment38, localDateTime39, localDateTime40);
        com.yorku.lab.pattern.state.ReservationState reservationState42 = reservation41.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState43 = reservation41.getCurrentState();
        reservation23.setState(reservationState43);
        reservation14.setState(reservationState43);
        reservation5.setState(reservationState43);
        com.yorku.lab.model.User user48 = null;
        com.yorku.lab.model.Equipment equipment49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        com.yorku.lab.model.Reservation reservation52 = new com.yorku.lab.model.Reservation("hi!", user48, equipment49, localDateTime50, localDateTime51);
        reservation52.markNoShow();
        com.yorku.lab.model.User user55 = null;
        com.yorku.lab.model.Equipment equipment56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        com.yorku.lab.model.Reservation reservation59 = new com.yorku.lab.model.Reservation("", user55, equipment56, localDateTime57, localDateTime58);
        com.yorku.lab.pattern.state.ReservationState reservationState60 = reservation59.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState61 = null;
        reservation59.setState(reservationState61);
        com.yorku.lab.model.User user63 = reservation59.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus64 = reservation59.getStatus();
        reservation52.setStatus(bookingStatus64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = reservation52.getPayments();
        com.yorku.lab.model.User user68 = null;
        com.yorku.lab.model.Equipment equipment69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        com.yorku.lab.model.Reservation reservation72 = new com.yorku.lab.model.Reservation("", user68, equipment69, localDateTime70, localDateTime71);
        com.yorku.lab.pattern.state.ReservationState reservationState73 = reservation72.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState74 = reservation72.getCurrentState();
        reservation52.setState(reservationState74);
        com.yorku.lab.model.User user77 = null;
        com.yorku.lab.model.Equipment equipment78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        com.yorku.lab.model.Reservation reservation81 = new com.yorku.lab.model.Reservation("", user77, equipment78, localDateTime79, localDateTime80);
        com.yorku.lab.pattern.state.ReservationState reservationState82 = reservation81.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState83 = null;
        reservation81.setState(reservationState83);
        com.yorku.lab.model.User user85 = reservation81.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus86 = reservation81.getStatus();
        reservation52.setStatus(bookingStatus86);
        reservation5.setStatus(bookingStatus86);
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(reservationState24);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNotNull(reservationState42);
        org.junit.Assert.assertNotNull(reservationState43);
        org.junit.Assert.assertNotNull(reservationState60);
        org.junit.Assert.assertNull(user63);
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus64.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(reservationState73);
        org.junit.Assert.assertNotNull(reservationState74);
        org.junit.Assert.assertNotNull(reservationState82);
        org.junit.Assert.assertNull(user85);
        org.junit.Assert.assertTrue("'" + bookingStatus86 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus86.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.User user6 = reservation5.getUser();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.modify(localDateTime7, localDateTime8);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.model.User user10 = null;
        com.yorku.lab.model.Equipment equipment11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        com.yorku.lab.model.Reservation reservation14 = new com.yorku.lab.model.Reservation("hi!", user10, equipment11, localDateTime12, localDateTime13);
        reservation14.markNoShow();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.Equipment equipment18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        com.yorku.lab.model.Reservation reservation21 = new com.yorku.lab.model.Reservation("", user17, equipment18, localDateTime19, localDateTime20);
        com.yorku.lab.pattern.state.ReservationState reservationState22 = reservation21.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState23 = null;
        reservation21.setState(reservationState23);
        com.yorku.lab.model.User user25 = reservation21.getUser();
        com.yorku.lab.enums.BookingStatus bookingStatus26 = reservation21.getStatus();
        reservation14.setStatus(bookingStatus26);
        reservation5.setStatus(bookingStatus26);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(reservationState22);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus26.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        com.yorku.lab.pattern.state.ReservationState reservationState7 = null;
        reservation5.setState(reservationState7);
        com.yorku.lab.pattern.state.ReservationState reservationState9 = null;
        reservation5.setState(reservationState9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = reservation5.getPayments();
        java.time.LocalDateTime localDateTime12 = null;
        reservation5.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation5.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = reservation5.getStartTime();
        java.time.LocalDateTime localDateTime17 = reservation5.getStartTime();
        com.yorku.lab.model.User user18 = reservation5.getUser();
        com.yorku.lab.model.Equipment equipment19 = reservation5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            reservation5.complete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.state.ReservationState.complete(com.yorku.lab.model.Reservation)\" because \"this.currentState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(equipment19);
    }
}

