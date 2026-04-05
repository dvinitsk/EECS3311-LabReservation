package com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BalanceServiceRegressionTest0 {

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
        com.yorku.lab.service.BookingService bookingService0 = null;
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = null;
        com.yorku.lab.service.BalanceService balanceService2 = new com.yorku.lab.service.BalanceService(bookingService0, paymentProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService2.getPaymentsForUser("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.service.BookingService.getReservationsByUser(String)\" because \"this.bookingService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.lang.Class<?> wildcardClass1 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass3 = paymentTransactionList2.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass5 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass5 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.service.BookingService bookingService0 = null;
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = null;
        com.yorku.lab.service.BalanceService balanceService2 = new com.yorku.lab.service.BalanceService(bookingService0, paymentProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = balanceService2.getTotalPaidByUser("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.service.BookingService.getReservationsByUser(String)\" because \"this.bookingService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass3 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.BookingService bookingService0 = null;
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = null;
        com.yorku.lab.service.BalanceService balanceService2 = new com.yorku.lab.service.BalanceService(bookingService0, paymentProcessor1);
        java.lang.Class<?> wildcardClass3 = balanceService2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass5 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass5 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass3 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass5 = paymentTransactionList4.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass9 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.service.BookingService bookingService0 = null;
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = null;
        com.yorku.lab.service.BalanceService balanceService2 = new com.yorku.lab.service.BalanceService(bookingService0, paymentProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = balanceService2.getTotalPaidByUser("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.service.BookingService.getReservationsByUser(String)\" because \"this.bookingService\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass9 = paymentTransactionList8.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass7 = paymentTransactionList6.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass17 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass7 = paymentTransactionList6.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass7 = paymentTransactionList6.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = paymentTransactionList14.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass9 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass9 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass7 = paymentTransactionList6.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass19 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass9 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        double double18 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.lang.Class<?> wildcardClass9 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        double double14 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = paymentTransactionList14.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass15 = paymentTransactionList14.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass21 = paymentTransactionList20.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass23 = paymentTransactionList22.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass21 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass7 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("hi!");
        java.lang.Class<?> wildcardClass21 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass23 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = paymentTransactionList14.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass17 = paymentTransactionList16.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass17 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass21 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass19 = paymentTransactionList18.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        double double22 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass23 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        double double22 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("hi!");
        java.lang.Class<?> wildcardClass17 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass9 = paymentTransactionList8.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass21 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass21 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        double double22 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass13 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("hi!");
        double double22 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass17 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        double double22 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass23 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass17 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        double double18 = balanceService0.getTotalPaidByUser("hi!");
        java.lang.Class<?> wildcardClass19 = balanceService0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        double double18 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        double double18 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass15 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        double double24 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("hi!");
        java.lang.Class<?> wildcardClass17 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        java.lang.Class<?> wildcardClass17 = paymentTransactionList16.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("hi!");
        double double10 = balanceService0.getTotalPaidByUser("");
        double double12 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass17 = paymentTransactionList16.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        java.lang.Class<?> wildcardClass9 = balanceService0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        double double22 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        double double12 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("hi!");
        double double24 = balanceService0.getTotalPaidByUser("");
        double double26 = balanceService0.getTotalPaidByUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        double double16 = balanceService0.getTotalPaidByUser("");
        double double18 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        double double12 = balanceService0.getTotalPaidByUser("hi!");
        double double14 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        double double18 = balanceService0.getTotalPaidByUser("");
        double double20 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("");
        double double8 = balanceService0.getTotalPaidByUser("");
        double double10 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = balanceService0.getPaymentsForUser("");
        double double16 = balanceService0.getTotalPaidByUser("");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList2 = balanceService0.getPaymentsForUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("");
        double double10 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionList2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = balanceService0.getPaymentsForUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.service.BalanceService balanceService0 = new com.yorku.lab.service.BalanceService();
        double double2 = balanceService0.getTotalPaidByUser("");
        double double4 = balanceService0.getTotalPaidByUser("");
        double double6 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = balanceService0.getPaymentsForUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = balanceService0.getPaymentsForUser("");
        double double14 = balanceService0.getTotalPaidByUser("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = balanceService0.getPaymentsForUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = balanceService0.getPaymentsForUser("");
        double double20 = balanceService0.getTotalPaidByUser("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = balanceService0.getPaymentsForUser("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }
}

