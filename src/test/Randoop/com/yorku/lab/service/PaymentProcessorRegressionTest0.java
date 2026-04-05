package test.Randoop.com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentProcessorRegressionTest0 {

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.model.PaymentTransaction paymentTransaction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.lang.Class<?> wildcardClass1 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.Class<?> wildcardClass3 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction4 = paymentProcessor0.processPayment((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.model.PaymentTransaction paymentTransaction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.List<java.lang.String> strList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations(strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.List<java.lang.String> strList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations(strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.lang.Class<?> wildcardClass11 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.lang.Class<?> wildcardClass13 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction10 = paymentProcessor0.processPayment((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.model.PaymentTransaction paymentTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.lang.Class<?> wildcardClass13 = strList9.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction24 = paymentProcessor0.processPayment(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction16 = paymentProcessor0.processPayment((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction22 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction6 = paymentProcessor0.processPayment((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction24 = paymentProcessor0.processPayment((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction10 = paymentProcessor0.processPayment((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction20 = paymentProcessor0.processPayment((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction12 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.List<java.lang.String> strList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations(strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction12 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction22 = paymentProcessor0.processPayment((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction16 = paymentProcessor0.processPayment((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.model.PaymentTransaction paymentTransaction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.lang.Class<?> wildcardClass31 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentProcessor9.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor12 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor12.setPaymentStrategy(paymentStrategy13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor12.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<java.lang.String> strList23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor0.getPaymentsForReservations(strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction4 = paymentProcessor0.processPayment((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.model.PaymentTransaction paymentTransaction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass13 = paymentTransactionOptional12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        com.yorku.lab.model.PaymentTransaction paymentTransaction31 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        java.util.List<java.lang.String> strList21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations(strList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction22 = paymentProcessor0.processPayment((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentProcessor9.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor12 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor12.setPaymentStrategy(paymentStrategy13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor12.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction24 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass19 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction14 = paymentProcessor0.processPayment((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction32 = paymentProcessor0.processPayment((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction18 = paymentProcessor0.processPayment((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass15 = paymentTransactionOptional14.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentProcessor0.getPaymentsForReservations(strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor5 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentProcessor5.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor8 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor8.setPaymentStrategy(paymentStrategy9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentProcessor8.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = paymentTransactionList8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.lang.Class<?> wildcardClass23 = paymentTransactionList22.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentProcessor13.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor16 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor16.setPaymentStrategy(paymentStrategy17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor16.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction28 = paymentProcessor0.processPayment((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.lang.Class<?> wildcardClass19 = strList15.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentProcessor9.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor12 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor12.setPaymentStrategy(paymentStrategy13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor12.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy23 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy23);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction26 = paymentProcessor0.processPayment((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.service.PaymentProcessor paymentProcessor19 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor19.setPaymentStrategy(paymentStrategy20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList25);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional29 = paymentProcessor19.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        com.yorku.lab.model.PaymentTransaction paymentTransaction41 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional6 = paymentProcessor0.getTransaction("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction8 = paymentProcessor0.processPayment(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy28);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentProcessor0.getPaymentsForReservations(strList41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentProcessor13.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor16 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor16.setPaymentStrategy(paymentStrategy17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor16.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        com.yorku.lab.model.PaymentTransaction paymentTransaction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass23 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.model.PaymentTransaction paymentTransaction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction24 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy28);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction42 = paymentProcessor0.processPayment((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.lang.Class<?> wildcardClass31 = paymentTransactionList30.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.model.PaymentTransaction paymentTransaction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("hi!");
        java.lang.Class<?> wildcardClass23 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        com.yorku.lab.model.PaymentTransaction paymentTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional6 = paymentProcessor0.getTransaction("hi!");
        java.lang.Class<?> wildcardClass7 = paymentTransactionOptional6.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy22);
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy25 = null;
        paymentProcessor24.setPaymentStrategy(paymentStrategy25);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        com.yorku.lab.service.PaymentProcessor paymentProcessor33 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy34 = null;
        paymentProcessor33.setPaymentStrategy(paymentStrategy34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentProcessor33.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        com.yorku.lab.model.PaymentTransaction paymentTransaction45 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations(strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        java.lang.Class<?> wildcardClass27 = paymentTransactionList26.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction6 = paymentProcessor0.processPayment((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.List<java.lang.String> strList19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations(strList19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction22 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction20 = paymentProcessor0.processPayment((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentProcessor13.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor16 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor16.setPaymentStrategy(paymentStrategy17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor16.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction28 = paymentProcessor0.processPayment((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.lang.Class<?> wildcardClass31 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentProcessor0.getTransaction("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional6 = paymentProcessor0.getTransaction("hi!");
        java.lang.Class<?> wildcardClass7 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentProcessor9.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor12 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor12.setPaymentStrategy(paymentStrategy13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor12.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction20 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional21 = paymentProcessor11.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy22);
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy25 = null;
        paymentProcessor24.setPaymentStrategy(paymentStrategy25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.lang.Class<?> wildcardClass35 = paymentTransactionList34.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy3 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy3);
        java.lang.Class<?> wildcardClass5 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor19 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor19.setPaymentStrategy(paymentStrategy20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList25);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional29 = paymentProcessor19.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        com.yorku.lab.service.PaymentProcessor paymentProcessor39 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy40 = null;
        paymentProcessor39.setPaymentStrategy(paymentStrategy40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentProcessor39.getPaymentsForReservations((java.util.List<java.lang.String>) strList45);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList45);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList45);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList45);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional52 = paymentProcessor0.getTransaction("");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional52);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        java.lang.Class<?> wildcardClass27 = paymentTransactionList26.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentProcessor0.getTransaction("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction30 = paymentProcessor0.processPayment((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass17 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        java.util.List<java.lang.String> strList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentProcessor0.getPaymentsForReservations(strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentProcessor21.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy25 = null;
        paymentProcessor24.setPaymentStrategy(paymentStrategy25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy34 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentProcessor21.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor38.setPaymentStrategy(paymentStrategy39);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        com.yorku.lab.service.PaymentProcessor paymentProcessor47 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy48 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy48);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        com.yorku.lab.service.PaymentProcessor paymentProcessor56 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy57 = null;
        paymentProcessor56.setPaymentStrategy(paymentStrategy57);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentProcessor56.getPaymentsForReservations((java.util.List<java.lang.String>) strList62);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList62);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy66 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy66);
        com.yorku.lab.service.PaymentProcessor paymentProcessor68 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy69 = null;
        paymentProcessor68.setPaymentStrategy(paymentStrategy69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentProcessor68.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList77 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList78 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(paymentTransactionList77);
        org.junit.Assert.assertNotNull(paymentTransactionList78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy3 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy3);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction6 = paymentProcessor0.processPayment((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy3 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction18 = paymentProcessor0.processPayment((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("hi!");
        java.util.List<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentProcessor0.getPaymentsForReservations(strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.lang.Class<?> wildcardClass11 = paymentTransactionList10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction20 = paymentProcessor0.processPayment((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction14 = paymentProcessor0.processPayment((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction4 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional21 = paymentProcessor11.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy22);
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy25 = null;
        paymentProcessor24.setPaymentStrategy(paymentStrategy25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        java.lang.Class<?> wildcardClass35 = strList30.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("hi!");
        java.util.List<java.lang.String> strList23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor0.getPaymentsForReservations(strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction26 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy5 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy5);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy7 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy7);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction10 = paymentProcessor0.processPayment((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor25 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentProcessor25.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor28 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy29 = null;
        paymentProcessor28.setPaymentStrategy(paymentStrategy29);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor28.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor25.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy38 = null;
        paymentProcessor25.setPaymentStrategy(paymentStrategy38);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional41 = paymentProcessor25.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional43 = paymentProcessor25.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor44 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy45 = null;
        paymentProcessor44.setPaymentStrategy(paymentStrategy45);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentProcessor44.getPaymentsForReservations((java.util.List<java.lang.String>) strList50);
        com.yorku.lab.service.PaymentProcessor paymentProcessor53 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy54 = null;
        paymentProcessor53.setPaymentStrategy(paymentStrategy54);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentProcessor53.getPaymentsForReservations((java.util.List<java.lang.String>) strList59);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentProcessor44.getPaymentsForReservations((java.util.List<java.lang.String>) strList59);
        com.yorku.lab.service.PaymentProcessor paymentProcessor63 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy64 = null;
        paymentProcessor63.setPaymentStrategy(paymentStrategy64);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList71 = paymentProcessor63.getPaymentsForReservations((java.util.List<java.lang.String>) strList69);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional73 = paymentProcessor63.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor74 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy75 = null;
        paymentProcessor74.setPaymentStrategy(paymentStrategy75);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentProcessor74.getPaymentsForReservations((java.util.List<java.lang.String>) strList80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentProcessor63.getPaymentsForReservations((java.util.List<java.lang.String>) strList80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList84 = paymentProcessor44.getPaymentsForReservations((java.util.List<java.lang.String>) strList80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList85 = paymentProcessor25.getPaymentsForReservations((java.util.List<java.lang.String>) strList80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList80);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionOptional41);
        org.junit.Assert.assertNotNull(paymentTransactionOptional43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList71);
        org.junit.Assert.assertNotNull(paymentTransactionOptional73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList84);
        org.junit.Assert.assertNotNull(paymentTransactionList85);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction20 = paymentProcessor0.processPayment((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        com.yorku.lab.service.PaymentProcessor paymentProcessor35 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy36 = null;
        paymentProcessor35.setPaymentStrategy(paymentStrategy36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentProcessor35.getPaymentsForReservations((java.util.List<java.lang.String>) strList41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList41);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy45 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy45);
        com.yorku.lab.service.PaymentProcessor paymentProcessor47 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy48 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<java.lang.String> strList59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentProcessor0.getPaymentsForReservations(strList59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy5 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy5);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy7 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction16 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass3 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        com.yorku.lab.model.PaymentTransaction paymentTransaction31 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass21 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction22 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy22);
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy25 = null;
        paymentProcessor24.setPaymentStrategy(paymentStrategy25);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList30);
        com.yorku.lab.service.PaymentProcessor paymentProcessor33 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy34 = null;
        paymentProcessor33.setPaymentStrategy(paymentStrategy34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentProcessor33.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList39);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction46 = paymentProcessor0.processPayment(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction28 = paymentProcessor0.processPayment((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction29 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor5 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentProcessor5.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor8 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor8.setPaymentStrategy(paymentStrategy9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentProcessor8.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy27);
        com.yorku.lab.service.PaymentProcessor paymentProcessor29 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy30 = null;
        paymentProcessor29.setPaymentStrategy(paymentStrategy30);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor29.getPaymentsForReservations((java.util.List<java.lang.String>) strList35);
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor38.setPaymentStrategy(paymentStrategy39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentProcessor29.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction52 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.lang.Class<?> wildcardClass41 = strList36.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy41 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy41);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.List<java.lang.String> strList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentProcessor0.getPaymentsForReservations(strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction16 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        com.yorku.lab.service.PaymentProcessor paymentProcessor35 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy36 = null;
        paymentProcessor35.setPaymentStrategy(paymentStrategy36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentProcessor35.getPaymentsForReservations((java.util.List<java.lang.String>) strList41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList41);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy45 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy45);
        com.yorku.lab.service.PaymentProcessor paymentProcessor47 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy48 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy59 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy59);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy61 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy61);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        com.yorku.lab.service.PaymentProcessor paymentProcessor23 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentProcessor23.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        com.yorku.lab.model.PaymentTransaction paymentTransaction37 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        com.yorku.lab.service.PaymentProcessor paymentProcessor23 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentProcessor23.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction38 = paymentProcessor0.processPayment(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy31);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.service.PaymentProcessor paymentProcessor19 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor19.setPaymentStrategy(paymentStrategy20);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList25);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional29 = paymentProcessor19.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.lang.Class<?> wildcardClass41 = strList36.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<java.lang.String> strList31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor0.getPaymentsForReservations(strList31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentProcessor11.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor14 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor14.setPaymentStrategy(paymentStrategy15);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor14.getPaymentsForReservations((java.util.List<java.lang.String>) strList20);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList20);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy24 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentProcessor11.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor28 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy29 = null;
        paymentProcessor28.setPaymentStrategy(paymentStrategy29);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor28.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.lang.Class<?> wildcardClass39 = paymentTransactionList38.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor23 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy24 = null;
        paymentProcessor23.setPaymentStrategy(paymentStrategy24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList29);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentProcessor23.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor34 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy35 = null;
        paymentProcessor34.setPaymentStrategy(paymentStrategy35);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentProcessor34.getPaymentsForReservations((java.util.List<java.lang.String>) strList40);
        com.yorku.lab.service.PaymentProcessor paymentProcessor43 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy44 = null;
        paymentProcessor43.setPaymentStrategy(paymentStrategy44);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentProcessor43.getPaymentsForReservations((java.util.List<java.lang.String>) strList49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentProcessor34.getPaymentsForReservations((java.util.List<java.lang.String>) strList49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList53 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList49);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionList53);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction26 = paymentProcessor0.processPayment((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor22 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy23 = null;
        paymentProcessor22.setPaymentStrategy(paymentStrategy23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor22.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        com.yorku.lab.service.PaymentProcessor paymentProcessor32 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy33 = null;
        paymentProcessor32.setPaymentStrategy(paymentStrategy33);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor32.getPaymentsForReservations((java.util.List<java.lang.String>) strList38);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional42 = paymentProcessor32.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy43 = null;
        paymentProcessor32.setPaymentStrategy(paymentStrategy43);
        com.yorku.lab.service.PaymentProcessor paymentProcessor45 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy46 = null;
        paymentProcessor45.setPaymentStrategy(paymentStrategy46);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList53 = paymentProcessor45.getPaymentsForReservations((java.util.List<java.lang.String>) strList51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentProcessor32.getPaymentsForReservations((java.util.List<java.lang.String>) strList51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList51);
        java.lang.Class<?> wildcardClass57 = strList51.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList53);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy28);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy41 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy41);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional31 = paymentProcessor21.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor32 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy33 = null;
        paymentProcessor32.setPaymentStrategy(paymentStrategy33);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor32.getPaymentsForReservations((java.util.List<java.lang.String>) strList38);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional42 = paymentProcessor32.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor43 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy44 = null;
        paymentProcessor43.setPaymentStrategy(paymentStrategy44);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentProcessor43.getPaymentsForReservations((java.util.List<java.lang.String>) strList49);
        com.yorku.lab.service.PaymentProcessor paymentProcessor52 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy53 = null;
        paymentProcessor52.setPaymentStrategy(paymentStrategy53);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentProcessor52.getPaymentsForReservations((java.util.List<java.lang.String>) strList58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentProcessor43.getPaymentsForReservations((java.util.List<java.lang.String>) strList58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentProcessor32.getPaymentsForReservations((java.util.List<java.lang.String>) strList58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList58);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy65 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy65);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionOptional31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(paymentTransactionList63);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor19 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional21 = paymentProcessor19.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor22 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy23 = null;
        paymentProcessor22.setPaymentStrategy(paymentStrategy23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor22.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        com.yorku.lab.service.PaymentProcessor paymentProcessor35 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy36 = null;
        paymentProcessor35.setPaymentStrategy(paymentStrategy36);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentProcessor35.getPaymentsForReservations((java.util.List<java.lang.String>) strList41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList41);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy45 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy45);
        com.yorku.lab.service.PaymentProcessor paymentProcessor47 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy48 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy59 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy59);
        com.yorku.lab.model.PaymentTransaction paymentTransaction61 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor5 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentProcessor5.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor8 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor8.setPaymentStrategy(paymentStrategy9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentProcessor8.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy27);
        com.yorku.lab.service.PaymentProcessor paymentProcessor29 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy30 = null;
        paymentProcessor29.setPaymentStrategy(paymentStrategy30);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor29.getPaymentsForReservations((java.util.List<java.lang.String>) strList35);
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor38.setPaymentStrategy(paymentStrategy39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentProcessor29.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy51 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy51);
        com.yorku.lab.model.PaymentTransaction paymentTransaction53 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction14 = paymentProcessor0.processPayment((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor19 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional21 = paymentProcessor19.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor22 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy23 = null;
        paymentProcessor22.setPaymentStrategy(paymentStrategy23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor22.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList28);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy32 = null;
        paymentProcessor19.setPaymentStrategy(paymentStrategy32);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentProcessor19.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentProcessor19.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor38.setPaymentStrategy(paymentStrategy39);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        com.yorku.lab.service.PaymentProcessor paymentProcessor47 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy48 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        com.yorku.lab.service.PaymentProcessor paymentProcessor57 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy58 = null;
        paymentProcessor57.setPaymentStrategy(paymentStrategy58);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentProcessor57.getPaymentsForReservations((java.util.List<java.lang.String>) strList63);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional67 = paymentProcessor57.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor68 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy69 = null;
        paymentProcessor68.setPaymentStrategy(paymentStrategy69);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentProcessor68.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList77 = paymentProcessor57.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList78 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList74);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction82 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(paymentTransactionOptional67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(paymentTransactionList77);
        org.junit.Assert.assertNotNull(paymentTransactionList78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("hi!");
        java.lang.Class<?> wildcardClass19 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentProcessor9.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor12 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor12.setPaymentStrategy(paymentStrategy13);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor12.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList18);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy23 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy23);
        com.yorku.lab.service.PaymentProcessor paymentProcessor25 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy26 = null;
        paymentProcessor25.setPaymentStrategy(paymentStrategy26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentProcessor25.getPaymentsForReservations((java.util.List<java.lang.String>) strList31);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy34 = null;
        paymentProcessor25.setPaymentStrategy(paymentStrategy34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentProcessor25.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentProcessor38.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor41 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy42 = null;
        paymentProcessor41.setPaymentStrategy(paymentStrategy42);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentProcessor41.getPaymentsForReservations((java.util.List<java.lang.String>) strList47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentProcessor25.getPaymentsForReservations((java.util.List<java.lang.String>) strList47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList47);
        com.yorku.lab.model.PaymentTransaction paymentTransaction53 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.service.PaymentProcessor paymentProcessor20 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor20.setPaymentStrategy(paymentStrategy21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentProcessor20.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList26);
        java.lang.Class<?> wildcardClass31 = strList26.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor5 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentProcessor5.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor8 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor8.setPaymentStrategy(paymentStrategy9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentProcessor8.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList14);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy27);
        com.yorku.lab.service.PaymentProcessor paymentProcessor29 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy30 = null;
        paymentProcessor29.setPaymentStrategy(paymentStrategy30);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor29.getPaymentsForReservations((java.util.List<java.lang.String>) strList35);
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor38.setPaymentStrategy(paymentStrategy39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentProcessor29.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentProcessor5.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        com.yorku.lab.model.PaymentTransaction paymentTransaction51 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass19 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction42 = paymentProcessor0.processPayment((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        java.lang.Class<?> wildcardClass13 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.lang.Class<?> wildcardClass13 = paymentTransactionList12.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentProcessor11.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentProcessor24.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor27 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor27.setPaymentStrategy(paymentStrategy28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor27.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy39);
        com.yorku.lab.model.PaymentTransaction paymentTransaction41 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass15 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy5 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy5);
        com.yorku.lab.model.PaymentTransaction paymentTransaction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentProcessor11.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentProcessor24.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor27 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor27.setPaymentStrategy(paymentStrategy28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor27.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction40 = paymentProcessor0.processPayment((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy14 = null;
        paymentProcessor13.setPaymentStrategy(paymentStrategy14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList19);
        java.lang.Class<?> wildcardClass23 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentProcessor11.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor24 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentProcessor24.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor27 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor27.setPaymentStrategy(paymentStrategy28);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor27.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor24.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy39);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional42 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction44 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional42);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentProcessor0.getTransaction("");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy5 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy5);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentProcessor0.getTransaction("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.service.PaymentProcessor paymentProcessor18 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor18.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor18.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy28);
        com.yorku.lab.service.PaymentProcessor paymentProcessor30 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy31 = null;
        paymentProcessor30.setPaymentStrategy(paymentStrategy31);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor30.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList36);
        com.yorku.lab.model.PaymentTransaction paymentTransaction41 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction20 = paymentProcessor0.processPayment((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.service.PaymentProcessor paymentProcessor1 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy2 = null;
        paymentProcessor1.setPaymentStrategy(paymentStrategy2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentProcessor1.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList7);
        java.lang.Class<?> wildcardClass11 = strList7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("hi!");
        java.lang.Class<?> wildcardClass23 = paymentTransactionOptional22.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor13 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentProcessor13.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor16 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor16.setPaymentStrategy(paymentStrategy17);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor16.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor13.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList22);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy27);
        com.yorku.lab.model.PaymentTransaction paymentTransaction29 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.service.PaymentProcessor paymentProcessor9 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy10 = null;
        paymentProcessor9.setPaymentStrategy(paymentStrategy10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentProcessor9.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        com.yorku.lab.service.PaymentProcessor paymentProcessor21 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy22 = null;
        paymentProcessor21.setPaymentStrategy(paymentStrategy22);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentProcessor21.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList27);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction32 = paymentProcessor0.processPayment((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction24 = paymentProcessor0.processPayment(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy11 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction14 = paymentProcessor0.processPayment((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        java.util.List<java.lang.String> strList23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentProcessor0.getPaymentsForReservations(strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.isEmpty()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor17 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy18 = null;
        paymentProcessor17.setPaymentStrategy(paymentStrategy18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList23);
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        com.yorku.lab.service.PaymentProcessor paymentProcessor36 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy37 = null;
        paymentProcessor36.setPaymentStrategy(paymentStrategy37);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentProcessor36.getPaymentsForReservations((java.util.List<java.lang.String>) strList42);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentProcessor36.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor47 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy48 = null;
        paymentProcessor47.setPaymentStrategy(paymentStrategy48);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentProcessor47.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentProcessor36.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList53);
        com.yorku.lab.service.PaymentProcessor paymentProcessor58 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy59 = null;
        paymentProcessor58.setPaymentStrategy(paymentStrategy59);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentProcessor58.getPaymentsForReservations((java.util.List<java.lang.String>) strList64);
        com.yorku.lab.service.PaymentProcessor paymentProcessor67 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy68 = null;
        paymentProcessor67.setPaymentStrategy(paymentStrategy68);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentProcessor67.getPaymentsForReservations((java.util.List<java.lang.String>) strList73);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentProcessor58.getPaymentsForReservations((java.util.List<java.lang.String>) strList73);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy77 = null;
        paymentProcessor58.setPaymentStrategy(paymentStrategy77);
        com.yorku.lab.service.PaymentProcessor paymentProcessor79 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy80 = null;
        paymentProcessor79.setPaymentStrategy(paymentStrategy80);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList87 = paymentProcessor79.getPaymentsForReservations((java.util.List<java.lang.String>) strList85);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList88 = paymentProcessor58.getPaymentsForReservations((java.util.List<java.lang.String>) strList85);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentProcessor17.getPaymentsForReservations((java.util.List<java.lang.String>) strList85);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList90 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList85);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList87);
        org.junit.Assert.assertNotNull(paymentTransactionList88);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList90);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentProcessor0.getTransaction("");
        java.lang.Class<?> wildcardClass15 = paymentTransactionOptional14.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentProcessor0.getTransaction("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor19 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy20 = null;
        paymentProcessor19.setPaymentStrategy(paymentStrategy20);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList25);
        com.yorku.lab.service.PaymentProcessor paymentProcessor28 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy29 = null;
        paymentProcessor28.setPaymentStrategy(paymentStrategy29);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor28.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        com.yorku.lab.service.PaymentProcessor paymentProcessor38 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy39 = null;
        paymentProcessor38.setPaymentStrategy(paymentStrategy39);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList44);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional48 = paymentProcessor38.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor49 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy50 = null;
        paymentProcessor49.setPaymentStrategy(paymentStrategy50);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentProcessor49.getPaymentsForReservations((java.util.List<java.lang.String>) strList55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentProcessor38.getPaymentsForReservations((java.util.List<java.lang.String>) strList55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentProcessor19.getPaymentsForReservations((java.util.List<java.lang.String>) strList55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList55);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy61 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy61);
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.lab.model.PaymentTransaction paymentTransaction64 = paymentProcessor0.processPayment((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PaymentStrategy.pay(double)\" because \"this.paymentStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentProcessor0.getTransaction("");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy19 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy19);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList24);
        com.yorku.lab.service.PaymentProcessor paymentProcessor27 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy28 = null;
        paymentProcessor27.setPaymentStrategy(paymentStrategy28);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor27.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        java.lang.Class<?> wildcardClass23 = paymentProcessor0.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor3 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy4 = null;
        paymentProcessor3.setPaymentStrategy(paymentStrategy4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentProcessor3.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList9);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy13 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy13);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy15);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy17 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentProcessor0.getTransaction("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentProcessor0.saveTransaction(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy9 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy9);
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentProcessor11.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor14 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy15 = null;
        paymentProcessor14.setPaymentStrategy(paymentStrategy15);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentProcessor14.getPaymentsForReservations((java.util.List<java.lang.String>) strList20);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList20);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy24 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentProcessor11.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor28 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy29 = null;
        paymentProcessor28.setPaymentStrategy(paymentStrategy29);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor28.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy41 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy41);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy43 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy43);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy21 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy21);
        com.yorku.lab.service.PaymentProcessor paymentProcessor23 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentProcessor23.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor26 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy27 = null;
        paymentProcessor26.setPaymentStrategy(paymentStrategy27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentProcessor26.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList32);
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy37 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy37);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.yorku.lab.service.PaymentProcessor paymentProcessor0 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy1 = null;
        paymentProcessor0.setPaymentStrategy(paymentStrategy1);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentProcessor0.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor11 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy12 = null;
        paymentProcessor11.setPaymentStrategy(paymentStrategy12);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentProcessor11.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentProcessor0.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor23 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy24 = null;
        paymentProcessor23.setPaymentStrategy(paymentStrategy24);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList29);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentProcessor23.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor34 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy35 = null;
        paymentProcessor34.setPaymentStrategy(paymentStrategy35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentProcessor34.getPaymentsForReservations((java.util.List<java.lang.String>) strList40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList40);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional45 = paymentProcessor23.getTransaction("hi!");
        com.yorku.lab.service.PaymentProcessor paymentProcessor46 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy47 = null;
        paymentProcessor46.setPaymentStrategy(paymentStrategy47);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentProcessor46.getPaymentsForReservations((java.util.List<java.lang.String>) strList52);
        com.yorku.lab.service.PaymentProcessor paymentProcessor55 = new com.yorku.lab.service.PaymentProcessor();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional57 = paymentProcessor55.getTransaction("");
        com.yorku.lab.service.PaymentProcessor paymentProcessor58 = new com.yorku.lab.service.PaymentProcessor();
        com.yorku.lab.pattern.strategy.PaymentStrategy paymentStrategy59 = null;
        paymentProcessor58.setPaymentStrategy(paymentStrategy59);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentProcessor58.getPaymentsForReservations((java.util.List<java.lang.String>) strList64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentProcessor55.getPaymentsForReservations((java.util.List<java.lang.String>) strList64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentProcessor46.getPaymentsForReservations((java.util.List<java.lang.String>) strList64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList69 = paymentProcessor23.getPaymentsForReservations((java.util.List<java.lang.String>) strList64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList70 = paymentProcessor0.getPaymentsForReservations((java.util.List<java.lang.String>) strList64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionOptional45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionOptional57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(paymentTransactionList69);
        org.junit.Assert.assertNotNull(paymentTransactionList70);
    }
}

