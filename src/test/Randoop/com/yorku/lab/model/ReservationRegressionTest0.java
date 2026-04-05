package com.yorku.lab.model;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = null;
        reservation5.setEndTime(localDateTime7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        java.lang.String str7 = reservation5.getReservationId();
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        boolean boolean9 = reservation5.isArrived();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = reservation5.getPayments();
        reservation5.cancel();
        org.junit.Assert.assertNotNull(paymentTransactionList6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = reservation5.getPayments();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        reservation5.modify(localDateTime7, localDateTime8);
        org.junit.Assert.assertNotNull(reservationState6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        java.lang.String str7 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime8 = reservation5.getStartTime();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        reservation5.setStartTime(localDateTime6);
        java.time.LocalDateTime localDateTime8 = reservation5.getEndTime();
        reservation5.cancel();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + com.yorku.lab.enums.BookingStatus.CANCELLED + "'", bookingStatus11.equals(com.yorku.lab.enums.BookingStatus.CANCELLED));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.enums.BookingStatus bookingStatus6 = reservation5.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus6.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.model.Equipment equipment6 = reservation5.getEquipment();
        boolean boolean7 = reservation5.isArrived();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = reservation5.getPayments();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
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
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        reservation5.markNoShow();
        java.time.LocalDateTime localDateTime7 = reservation5.getEndTime();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        reservation5.markNoShow();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        reservation5.setArrived(false);
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
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
        org.junit.Assert.assertNotNull(reservationState13);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + com.yorku.lab.enums.BookingStatus.CONFIRMED + "'", bookingStatus17.equals(com.yorku.lab.enums.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(reservationState26);
        org.junit.Assert.assertNotNull(reservationState27);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("hi!", user1, equipment2, localDateTime3, localDateTime4);
        java.lang.String str6 = reservation5.getReservationId();
        java.time.LocalDateTime localDateTime7 = reservation5.getStartTime();
        com.yorku.lab.model.User user8 = reservation5.getUser();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
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
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        com.yorku.lab.model.Reservation reservation5 = new com.yorku.lab.model.Reservation("", user1, equipment2, localDateTime3, localDateTime4);
        com.yorku.lab.pattern.state.ReservationState reservationState6 = reservation5.getCurrentState();
        java.time.LocalDateTime localDateTime7 = reservation5.getEndTime();
        com.yorku.lab.pattern.state.ReservationState reservationState8 = reservation5.getCurrentState();
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNotNull(reservationState8);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
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
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
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
        org.junit.Assert.assertNotNull(reservationState6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(bookingStatus13);
        org.junit.Assert.assertNull(bookingStatus16);
    }
}

