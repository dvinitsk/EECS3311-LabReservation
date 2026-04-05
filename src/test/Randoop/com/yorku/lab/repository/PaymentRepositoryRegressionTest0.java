package test.Randoop.com.yorku.lab.repository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentRepositoryRegressionTest0 {

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
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.model.PaymentTransaction paymentTransaction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.lang.Class<?> wildcardClass6 = strSet3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass3 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass8 = paymentTransactionOptional7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.model.PaymentTransaction paymentTransaction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet4 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds(strSet4);
        java.lang.Class<?> wildcardClass6 = paymentTransactionList5.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.lang.Class<?> wildcardClass15 = strSet11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.lang.Class<?> wildcardClass11 = strSet8.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        com.yorku.lab.model.PaymentTransaction paymentTransaction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet4);
        paymentRepository0.saveAll(paymentTransactionList6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.model.PaymentTransaction paymentTransaction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.lang.Class<?> wildcardClass11 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.lang.Class<?> wildcardClass15 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet4 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds(strSet4);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.lang.Class<?> wildcardClass15 = paymentTransactionList14.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository0.findById("");
        java.lang.Class<?> wildcardClass23 = paymentTransactionOptional22.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository11.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository14.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentRepository14.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository14.findAll();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet22);
        com.yorku.lab.repository.PaymentRepository paymentRepository26 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet29);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentRepository26.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository34 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository34.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet4);
        paymentRepository0.saveAll(paymentTransactionList6);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction42 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("");
        java.lang.Class<?> wildcardClass9 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional17 = paymentRepository15.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository15.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository15.findAll();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet23);
        com.yorku.lab.repository.PaymentRepository paymentRepository27 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository27.findByReservationIds((java.util.Set<java.lang.String>) strSet30);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional34 = paymentRepository27.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository35 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository35.findByReservationIds((java.util.Set<java.lang.String>) strSet38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository27.findByReservationIds((java.util.Set<java.lang.String>) strSet38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet38);
        com.yorku.lab.repository.PaymentRepository paymentRepository43 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentRepository43.findByReservationIds((java.util.Set<java.lang.String>) strSet46);
        java.util.Set<java.lang.String> strSet49 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository43.findByReservationIds(strSet49);
        paymentRepository12.saveAll(paymentTransactionList50);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository12.findAll();
        paymentRepository0.saveAll(paymentTransactionList52);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional17);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionOptional34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        java.lang.Class<?> wildcardClass10 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository11.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository11.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet19);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentRepository16.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository24 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional39 = paymentRepository32.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository40 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository40.findByReservationIds((java.util.Set<java.lang.String>) strSet43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet43);
        paymentRepository11.saveAll(paymentTransactionList46);
        paymentRepository0.saveAll(paymentTransactionList46);
        com.yorku.lab.repository.PaymentRepository paymentRepository49 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentRepository49.findByReservationIds((java.util.Set<java.lang.String>) strSet52);
        java.util.Set<java.lang.String> strSet55 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository49.findByReservationIds(strSet55);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional58 = paymentRepository49.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository49.findAll();
        paymentRepository0.saveAll(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionOptional39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionOptional58);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        com.yorku.lab.repository.PaymentRepository paymentRepository7 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository7.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository10 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository10.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository10.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository10.findAll();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository10.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository7.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        com.yorku.lab.repository.PaymentRepository paymentRepository22 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository22.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository25.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository25.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository25.findAll();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository22.findByReservationIds((java.util.Set<java.lang.String>) strSet33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository7.findByReservationIds((java.util.Set<java.lang.String>) strSet33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet33);
        com.yorku.lab.model.PaymentTransaction paymentTransaction39 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentRepository23.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository23.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        com.yorku.lab.repository.PaymentRepository paymentRepository44 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional51 = paymentRepository44.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository52 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository52.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        paymentRepository23.saveAll(paymentTransactionList58);
        java.util.Set<java.lang.String> strSet60 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository23.findByReservationIds(strSet60);
        paymentRepository0.saveAll(paymentTransactionList61);
        java.lang.Class<?> wildcardClass63 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionOptional51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository9 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet12);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.lang.Class<?> wildcardClass32 = strSet26.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.lang.Class<?> wildcardClass21 = paymentTransactionList20.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction47 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet4 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds(strSet4);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional17 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository18 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository18.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository18.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository18.findAll();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository18.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional17);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional17 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository18 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository18.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository18.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository18.findAll();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository18.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.lang.Class<?> wildcardClass31 = paymentTransactionList30.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional17);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository26 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository26.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository26.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional38 = paymentRepository31.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional52 = paymentRepository48.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet56);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository53.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        com.yorku.lab.repository.PaymentRepository paymentRepository69 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet72);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional76 = paymentRepository69.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository77 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentRepository77.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        paymentRepository48.saveAll(paymentTransactionList83);
        java.util.Set<java.lang.String> strSet85 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository48.findByReservationIds(strSet85);
        paymentRepository25.saveAll(paymentTransactionList86);
        paymentRepository0.saveAll(paymentTransactionList86);
        com.yorku.lab.model.PaymentTransaction paymentTransaction89 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionOptional38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionOptional76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.Set<java.lang.String> strSet11 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findByReservationIds(strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.lang.Class<?> wildcardClass23 = strSet17.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.model.PaymentTransaction paymentTransaction35 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.lang.Class<?> wildcardClass35 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet60 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository0.findByReservationIds(strSet60);
        com.yorku.lab.model.PaymentTransaction paymentTransaction62 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository26 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository26.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository26.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional38 = paymentRepository31.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional52 = paymentRepository48.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet56);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository53.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        com.yorku.lab.repository.PaymentRepository paymentRepository69 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet72);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional76 = paymentRepository69.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository77 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentRepository77.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        paymentRepository48.saveAll(paymentTransactionList83);
        java.util.Set<java.lang.String> strSet85 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository48.findByReservationIds(strSet85);
        paymentRepository25.saveAll(paymentTransactionList86);
        paymentRepository0.saveAll(paymentTransactionList86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionOptional38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionOptional76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet32 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository0.findByReservationIds(strSet32);
        java.lang.Class<?> wildcardClass34 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.repository.PaymentRepository paymentRepository33 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository33.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        paymentRepository12.saveAll(paymentTransactionList47);
        java.util.Set<java.lang.String> strSet49 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository12.findByReservationIds(strSet49);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional65 = paymentRepository58.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository66 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList71 = paymentRepository66.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        paymentRepository0.saveAll(paymentTransactionList72);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional75 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction76 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList71);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionOptional75);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        com.yorku.lab.repository.PaymentRepository paymentRepository22 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository22.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentRepository22.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository22.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository22.findAll();
        paymentRepository0.saveAll(paymentTransactionList28);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet32 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository0.findByReservationIds(strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction35 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional41 = paymentRepository39.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository39.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository39.findAll();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet46);
        com.yorku.lab.repository.PaymentRepository paymentRepository49 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentRepository49.findByReservationIds((java.util.Set<java.lang.String>) strSet52);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional56 = paymentRepository49.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository49.findAll();
        paymentRepository39.saveAll(paymentTransactionList57);
        paymentRepository0.saveAll(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionOptional56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository39.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository47 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository47.findByReservationIds((java.util.Set<java.lang.String>) strSet50);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList53 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet50);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionList53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository7 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository7.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray10 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList11, paymentTransactionArray10);
        paymentRepository7.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList11);
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository14.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional19 = paymentRepository17.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository17.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository17.findAll();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet25);
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional31 = paymentRepository29.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional34 = paymentRepository32.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository32.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository32.findAll();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository7.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        paymentRepository0.saveAll(paymentTransactionList45);
        com.yorku.lab.repository.PaymentRepository paymentRepository47 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository47.findByReservationIds((java.util.Set<java.lang.String>) strSet50);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional54 = paymentRepository47.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository55 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentRepository55.findByReservationIds((java.util.Set<java.lang.String>) strSet58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository47.findByReservationIds((java.util.Set<java.lang.String>) strSet58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet58);
        java.util.Set<java.lang.String> strSet63 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentRepository0.findByReservationIds(strSet63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionArray10);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray10, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionOptional31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionOptional54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.lang.Class<?> wildcardClass59 = paymentTransactionList56.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet4);
        paymentRepository0.saveAll(paymentTransactionList6);
        java.lang.Class<?> wildcardClass8 = paymentTransactionList6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository0.findById("");
        java.lang.Class<?> wildcardClass13 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass7 = paymentTransactionList6.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentRepository23.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository23.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        com.yorku.lab.repository.PaymentRepository paymentRepository44 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional51 = paymentRepository44.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository52 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository52.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        paymentRepository23.saveAll(paymentTransactionList58);
        java.util.Set<java.lang.String> strSet60 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository23.findByReservationIds(strSet60);
        paymentRepository0.saveAll(paymentTransactionList61);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionOptional51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet32 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository0.findByReservationIds(strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        paymentRepository0.saveAll(paymentTransactionList13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        com.yorku.lab.repository.PaymentRepository paymentRepository59 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional61 = paymentRepository59.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository62 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional64 = paymentRepository62.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentRepository62.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository62.findAll();
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository62.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList73 = paymentRepository59.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        com.yorku.lab.repository.PaymentRepository paymentRepository74 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository75 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional77 = paymentRepository75.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional79 = paymentRepository75.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository80 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet83 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet83, strArray82);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList85 = paymentRepository80.findByReservationIds((java.util.Set<java.lang.String>) strSet83);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional87 = paymentRepository80.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository88 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList93 = paymentRepository88.findByReservationIds((java.util.Set<java.lang.String>) strSet91);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList94 = paymentRepository80.findByReservationIds((java.util.Set<java.lang.String>) strSet91);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList95 = paymentRepository75.findByReservationIds((java.util.Set<java.lang.String>) strSet91);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList96 = paymentRepository74.findByReservationIds((java.util.Set<java.lang.String>) strSet91);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList97 = paymentRepository59.findByReservationIds((java.util.Set<java.lang.String>) strSet91);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList98 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet91);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionOptional61);
        org.junit.Assert.assertNotNull(paymentTransactionOptional64);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionList73);
        org.junit.Assert.assertNotNull(paymentTransactionOptional77);
        org.junit.Assert.assertNotNull(paymentTransactionOptional79);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList85);
        org.junit.Assert.assertNotNull(paymentTransactionOptional87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList93);
        org.junit.Assert.assertNotNull(paymentTransactionList94);
        org.junit.Assert.assertNotNull(paymentTransactionList95);
        org.junit.Assert.assertNotNull(paymentTransactionList96);
        org.junit.Assert.assertNotNull(paymentTransactionList97);
        org.junit.Assert.assertNotNull(paymentTransactionList98);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction38 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository8.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray11 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList12, paymentTransactionArray11);
        paymentRepository8.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList12);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository8.findById("hi!");
        java.util.Set<java.lang.String> strSet17 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository8.findByReservationIds(strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository8.findAll();
        paymentRepository0.saveAll(paymentTransactionList19);
        java.lang.Class<?> wildcardClass21 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionArray11);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray11, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.Set<java.lang.String> strSet11 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findByReservationIds(strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository13.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository13.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository22 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository22.findByReservationIds((java.util.Set<java.lang.String>) strSet25);
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository22.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        com.yorku.lab.model.PaymentTransaction paymentTransaction39 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet60 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository0.findByReservationIds(strSet60);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction63 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository48.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository48.findAll();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository45.findByReservationIds((java.util.Set<java.lang.String>) strSet56);
        paymentRepository0.saveAll(paymentTransactionList59);
        com.yorku.lab.model.PaymentTransaction paymentTransaction61 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional17 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository18 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository18.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository18.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository18.findAll();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository18.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet31 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository0.findByReservationIds(strSet31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional17);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet26 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository0.findByReservationIds(strSet26);
        java.lang.Class<?> wildcardClass28 = paymentTransactionList27.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentRepository21.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentRepository21.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository21.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository28.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray31 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList32, paymentTransactionArray31);
        paymentRepository28.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList32);
        com.yorku.lab.repository.PaymentRepository paymentRepository35 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentRepository35.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository38 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository38.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository38.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository38.findAll();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList48 = paymentRepository38.findByReservationIds((java.util.Set<java.lang.String>) strSet46);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentRepository35.findByReservationIds((java.util.Set<java.lang.String>) strSet46);
        com.yorku.lab.repository.PaymentRepository paymentRepository50 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional52 = paymentRepository50.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional55 = paymentRepository53.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository53.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository53.findAll();
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentRepository50.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentRepository35.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        paymentRepository21.saveAll(paymentTransactionList66);
        paymentRepository0.saveAll(paymentTransactionList66);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(paymentTransactionArray31);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray31, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList48);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionOptional52);
        org.junit.Assert.assertNotNull(paymentTransactionOptional55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList63);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional17 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository18 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository18.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository18.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository18.findAll();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository18.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentRepository31.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray34 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList35, paymentTransactionArray34);
        paymentRepository31.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository38 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository38.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional43 = paymentRepository41.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository41.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository41.findAll();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet49);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository38.findByReservationIds((java.util.Set<java.lang.String>) strSet49);
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional55 = paymentRepository53.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository56 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional58 = paymentRepository56.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository56.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentRepository56.findAll();
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository56.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository38.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList69 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList70 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional17);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(paymentTransactionArray34);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray34, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionOptional55);
        org.junit.Assert.assertNotNull(paymentTransactionOptional58);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(paymentTransactionList69);
        org.junit.Assert.assertNotNull(paymentTransactionList70);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass40 = paymentTransactionList39.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass43 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentRepository23.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository23.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        com.yorku.lab.repository.PaymentRepository paymentRepository44 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional51 = paymentRepository44.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository52 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository52.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        paymentRepository23.saveAll(paymentTransactionList58);
        java.util.Set<java.lang.String> strSet60 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository23.findByReservationIds(strSet60);
        paymentRepository0.saveAll(paymentTransactionList61);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional64 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction65 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionOptional51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionOptional64);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional43 = paymentRepository41.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray44 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList45, paymentTransactionArray44);
        paymentRepository41.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList45);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional49 = paymentRepository41.findById("hi!");
        java.util.Set<java.lang.String> strSet50 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository41.findByReservationIds(strSet50);
        com.yorku.lab.repository.PaymentRepository paymentRepository52 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional55 = paymentRepository53.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional57 = paymentRepository53.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional65 = paymentRepository58.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository66 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList71 = paymentRepository66.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList73 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository52.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        com.yorku.lab.repository.PaymentRepository paymentRepository77 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentRepository77.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        com.yorku.lab.model.PaymentTransaction paymentTransaction84 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional43);
        org.junit.Assert.assertNotNull(paymentTransactionArray44);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray44, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional49);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionOptional55);
        org.junit.Assert.assertNotNull(paymentTransactionOptional57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList71);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionList73);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository11.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository11.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet19);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentRepository16.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository24 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional39 = paymentRepository32.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository40 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository40.findByReservationIds((java.util.Set<java.lang.String>) strSet43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet43);
        paymentRepository11.saveAll(paymentTransactionList46);
        paymentRepository0.saveAll(paymentTransactionList46);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionOptional39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository60 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional62 = paymentRepository60.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository63 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional65 = paymentRepository63.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository63.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository63.findAll();
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList73 = paymentRepository63.findByReservationIds((java.util.Set<java.lang.String>) strSet71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository60.findByReservationIds((java.util.Set<java.lang.String>) strSet71);
        com.yorku.lab.repository.PaymentRepository paymentRepository75 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository75.findByReservationIds((java.util.Set<java.lang.String>) strSet78);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional82 = paymentRepository75.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository83 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList88 = paymentRepository83.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository75.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList90 = paymentRepository60.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList91 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional93 = paymentRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass94 = paymentTransactionOptional93.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionOptional62);
        org.junit.Assert.assertNotNull(paymentTransactionOptional65);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList73);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
        org.junit.Assert.assertNotNull(paymentTransactionOptional82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList88);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList90);
        org.junit.Assert.assertNotNull(paymentTransactionList91);
        org.junit.Assert.assertNotNull(paymentTransactionOptional93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository9 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet12);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.repository.PaymentRepository paymentRepository33 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository33.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        paymentRepository12.saveAll(paymentTransactionList47);
        java.util.Set<java.lang.String> strSet49 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository12.findByReservationIds(strSet49);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository58.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional63 = paymentRepository61.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentRepository61.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentRepository61.findAll();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList71 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        com.yorku.lab.repository.PaymentRepository paymentRepository73 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional75 = paymentRepository73.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository76 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional78 = paymentRepository76.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentRepository76.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository76.findAll();
        java.lang.String[] strArray83 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository76.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList87 = paymentRepository73.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList88 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.Set<java.lang.String> strSet90 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList91 = paymentRepository0.findByReservationIds(strSet90);
        com.yorku.lab.model.PaymentTransaction paymentTransaction92 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(paymentTransactionOptional63);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList71);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionOptional75);
        org.junit.Assert.assertNotNull(paymentTransactionOptional78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
        org.junit.Assert.assertNotNull(paymentTransactionList87);
        org.junit.Assert.assertNotNull(paymentTransactionList88);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList91);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.repository.PaymentRepository paymentRepository33 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository33.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        paymentRepository12.saveAll(paymentTransactionList47);
        java.util.Set<java.lang.String> strSet49 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository12.findByReservationIds(strSet49);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional61 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionOptional61);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.repository.PaymentRepository paymentRepository35 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentRepository35.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository35.findAll();
        java.util.Set<java.lang.String> strSet39 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository35.findByReservationIds(strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository35.findAll();
        paymentRepository0.saveAll(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet60 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository0.findByReservationIds(strSet60);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass63 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository16.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository16.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository16.findAll();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional48 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository49 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional51 = paymentRepository49.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository49.findAll();
        java.util.Set<java.lang.String> strSet53 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentRepository49.findByReservationIds(strSet53);
        com.yorku.lab.repository.PaymentRepository paymentRepository55 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional57 = paymentRepository55.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository58.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository58.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository58.findAll();
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet66);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList69 = paymentRepository55.findByReservationIds((java.util.Set<java.lang.String>) strSet66);
        com.yorku.lab.repository.PaymentRepository paymentRepository70 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentRepository70.findByReservationIds((java.util.Set<java.lang.String>) strSet73);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional77 = paymentRepository70.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository78 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository78.findByReservationIds((java.util.Set<java.lang.String>) strSet81);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList84 = paymentRepository70.findByReservationIds((java.util.Set<java.lang.String>) strSet81);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList85 = paymentRepository55.findByReservationIds((java.util.Set<java.lang.String>) strSet81);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository49.findByReservationIds((java.util.Set<java.lang.String>) strSet81);
        paymentRepository0.saveAll(paymentTransactionList86);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional48);
        org.junit.Assert.assertNotNull(paymentTransactionOptional51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionOptional57);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(paymentTransactionList69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(paymentTransactionOptional77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList84);
        org.junit.Assert.assertNotNull(paymentTransactionList85);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional6 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository7 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository7.findByReservationIds((java.util.Set<java.lang.String>) strSet10);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository7.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository7.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentRepository7.findAll();
        paymentRepository0.saveAll(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional42 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional42);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction32 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet10 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository0.findByReservationIds(strSet10);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository10 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository10.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentRepository13.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentRepository13.findAll();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentRepository10.findByReservationIds((java.util.Set<java.lang.String>) strSet21);
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository25.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository28.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository28.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository28.findAll();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository10.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        paymentRepository0.saveAll(paymentTransactionList40);
        java.lang.Class<?> wildcardClass42 = paymentTransactionList40.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional43 = paymentRepository41.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray44 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList45, paymentTransactionArray44);
        paymentRepository41.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList45);
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository51 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository51.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentRepository51.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository51.findAll();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository51.findByReservationIds((java.util.Set<java.lang.String>) strSet59);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet59);
        com.yorku.lab.repository.PaymentRepository paymentRepository63 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional65 = paymentRepository63.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository66 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional68 = paymentRepository66.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList69 = paymentRepository66.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList70 = paymentRepository66.findAll();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentRepository66.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList77 = paymentRepository63.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList78 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional43);
        org.junit.Assert.assertNotNull(paymentTransactionArray44);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray44, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(paymentTransactionOptional65);
        org.junit.Assert.assertNotNull(paymentTransactionOptional68);
        org.junit.Assert.assertNotNull(paymentTransactionList69);
        org.junit.Assert.assertNotNull(paymentTransactionList70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(paymentTransactionList77);
        org.junit.Assert.assertNotNull(paymentTransactionList78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet32 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository0.findByReservationIds(strSet32);
        java.util.Set<java.lang.String> strSet34 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository0.findByReservationIds(strSet34);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentRepository31.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository34 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository35 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository35.findByReservationIds((java.util.Set<java.lang.String>) strSet38);
        paymentRepository34.saveAll(paymentTransactionList40);
        paymentRepository31.saveAll(paymentTransactionList40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository31.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository44 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository44.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository47 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional49 = paymentRepository47.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository47.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository47.findAll();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository47.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        com.yorku.lab.repository.PaymentRepository paymentRepository59 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentRepository59.findByReservationIds((java.util.Set<java.lang.String>) strSet62);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional66 = paymentRepository59.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository67 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository67.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList73 = paymentRepository59.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet70);
        com.yorku.lab.model.PaymentTransaction paymentTransaction77 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
        org.junit.Assert.assertNotNull(paymentTransactionOptional66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionList73);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        paymentRepository0.saveAll(paymentTransactionList13);
        java.lang.Class<?> wildcardClass15 = paymentTransactionList13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet4 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds(strSet4);
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository6.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository6.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet14);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository11.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository19 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentRepository19.findByReservationIds((java.util.Set<java.lang.String>) strSet22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet22);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet22);
        com.yorku.lab.repository.PaymentRepository paymentRepository27 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository27.findByReservationIds((java.util.Set<java.lang.String>) strSet30);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional34 = paymentRepository27.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository35 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository35.findByReservationIds((java.util.Set<java.lang.String>) strSet38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository27.findByReservationIds((java.util.Set<java.lang.String>) strSet38);
        paymentRepository6.saveAll(paymentTransactionList41);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository6.findByReservationIds(strSet43);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository6.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository47 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional49 = paymentRepository47.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray50 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList51, paymentTransactionArray50);
        paymentRepository47.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList51);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional55 = paymentRepository47.findById("hi!");
        java.util.Set<java.lang.String> strSet56 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository47.findByReservationIds(strSet56);
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository59 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional61 = paymentRepository59.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional63 = paymentRepository59.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository64 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList69 = paymentRepository64.findByReservationIds((java.util.Set<java.lang.String>) strSet67);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional71 = paymentRepository64.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository72 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList77 = paymentRepository72.findByReservationIds((java.util.Set<java.lang.String>) strSet75);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList78 = paymentRepository64.findByReservationIds((java.util.Set<java.lang.String>) strSet75);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentRepository59.findByReservationIds((java.util.Set<java.lang.String>) strSet75);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet75);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList81 = paymentRepository47.findByReservationIds((java.util.Set<java.lang.String>) strSet75);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet75);
        com.yorku.lab.repository.PaymentRepository paymentRepository83 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList88 = paymentRepository83.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList90 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionOptional34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional49);
        org.junit.Assert.assertNotNull(paymentTransactionArray50);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray50, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional55);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionOptional61);
        org.junit.Assert.assertNotNull(paymentTransactionOptional63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList69);
        org.junit.Assert.assertNotNull(paymentTransactionOptional71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList77);
        org.junit.Assert.assertNotNull(paymentTransactionList78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
        org.junit.Assert.assertNotNull(paymentTransactionList81);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList88);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList90);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray16 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList17, paymentTransactionArray16);
        paymentRepository13.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional21 = paymentRepository13.findById("hi!");
        java.util.Set<java.lang.String> strSet22 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentRepository13.findByReservationIds(strSet22);
        com.yorku.lab.repository.PaymentRepository paymentRepository24 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository25.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional29 = paymentRepository25.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository30 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository30.findByReservationIds((java.util.Set<java.lang.String>) strSet33);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentRepository30.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository38 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository38.findByReservationIds((java.util.Set<java.lang.String>) strSet41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository30.findByReservationIds((java.util.Set<java.lang.String>) strSet41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet41);
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository51 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository52 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository52.findByReservationIds((java.util.Set<java.lang.String>) strSet55);
        paymentRepository51.saveAll(paymentTransactionList57);
        paymentRepository48.saveAll(paymentTransactionList57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentRepository48.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional63 = paymentRepository61.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository64 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional66 = paymentRepository64.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository64.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository64.findAll();
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository64.findByReservationIds((java.util.Set<java.lang.String>) strSet72);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet72);
        com.yorku.lab.repository.PaymentRepository paymentRepository76 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList81 = paymentRepository76.findByReservationIds((java.util.Set<java.lang.String>) strSet79);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional83 = paymentRepository76.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository84 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet87 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet87, strArray86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository84.findByReservationIds((java.util.Set<java.lang.String>) strSet87);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList90 = paymentRepository76.findByReservationIds((java.util.Set<java.lang.String>) strSet87);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList91 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet87);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList92 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet87);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList93 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet87);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList94 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet87);
        com.yorku.lab.model.PaymentTransaction paymentTransaction95 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionArray16);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray16, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional21);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
        org.junit.Assert.assertNotNull(paymentTransactionOptional63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList81);
        org.junit.Assert.assertNotNull(paymentTransactionOptional83);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList90);
        org.junit.Assert.assertNotNull(paymentTransactionList91);
        org.junit.Assert.assertNotNull(paymentTransactionList92);
        org.junit.Assert.assertNotNull(paymentTransactionList93);
        org.junit.Assert.assertNotNull(paymentTransactionList94);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        com.yorku.lab.repository.PaymentRepository paymentRepository37 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository37.findByReservationIds((java.util.Set<java.lang.String>) strSet40);
        java.util.Set<java.lang.String> strSet43 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository37.findByReservationIds(strSet43);
        com.yorku.lab.repository.PaymentRepository paymentRepository45 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository45.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray48 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49, paymentTransactionArray48);
        paymentRepository45.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList49);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository45.findById("hi!");
        java.util.Set<java.lang.String> strSet54 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository45.findByReservationIds(strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository45.findAll();
        paymentRepository37.saveAll(paymentTransactionList56);
        paymentRepository0.saveAll(paymentTransactionList56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository60 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional62 = paymentRepository60.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository63 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional65 = paymentRepository63.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository63.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository63.findAll();
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList73 = paymentRepository63.findByReservationIds((java.util.Set<java.lang.String>) strSet71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository60.findByReservationIds((java.util.Set<java.lang.String>) strSet71);
        com.yorku.lab.repository.PaymentRepository paymentRepository75 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository75.findByReservationIds((java.util.Set<java.lang.String>) strSet78);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional82 = paymentRepository75.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository83 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList88 = paymentRepository83.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository75.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList90 = paymentRepository60.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList91 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet86);
        java.lang.Class<?> wildcardClass92 = paymentTransactionList91.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionArray48);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray48, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionOptional62);
        org.junit.Assert.assertNotNull(paymentTransactionOptional65);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList73);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
        org.junit.Assert.assertNotNull(paymentTransactionOptional82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList88);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList90);
        org.junit.Assert.assertNotNull(paymentTransactionList91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository8.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository8.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findAll();
        paymentRepository0.saveAll(paymentTransactionList13);
        java.lang.Class<?> wildcardClass15 = paymentTransactionList13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository26 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository26.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository26.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional38 = paymentRepository31.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional52 = paymentRepository48.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet56);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository53.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        com.yorku.lab.repository.PaymentRepository paymentRepository69 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet72);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional76 = paymentRepository69.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository77 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentRepository77.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        paymentRepository48.saveAll(paymentTransactionList83);
        java.util.Set<java.lang.String> strSet85 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository48.findByReservationIds(strSet85);
        paymentRepository25.saveAll(paymentTransactionList86);
        paymentRepository0.saveAll(paymentTransactionList86);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet90 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList91 = paymentRepository0.findByReservationIds(strSet90);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList92 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass93 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionOptional38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionOptional76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
        org.junit.Assert.assertNotNull(paymentTransactionList91);
        org.junit.Assert.assertNotNull(paymentTransactionList92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository16.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository16.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository16.findAll();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        com.yorku.lab.model.PaymentTransaction paymentTransaction45 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList25 = paymentRepository0.findAll();
        java.util.Set<java.lang.String> strSet26 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository0.findByReservationIds(strSet26);
        java.lang.Class<?> wildcardClass28 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionList25);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository16.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository16.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository16.findAll();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional48 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository49 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional51 = paymentRepository49.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository49.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository54 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository54.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional61 = paymentRepository54.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository62 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository62.findByReservationIds((java.util.Set<java.lang.String>) strSet65);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository54.findByReservationIds((java.util.Set<java.lang.String>) strSet65);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList69 = paymentRepository49.findByReservationIds((java.util.Set<java.lang.String>) strSet65);
        com.yorku.lab.repository.PaymentRepository paymentRepository70 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentRepository70.findByReservationIds((java.util.Set<java.lang.String>) strSet73);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional77 = paymentRepository70.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository78 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository78.findByReservationIds((java.util.Set<java.lang.String>) strSet81);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList84 = paymentRepository70.findByReservationIds((java.util.Set<java.lang.String>) strSet81);
        paymentRepository49.saveAll(paymentTransactionList84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository49.findAll();
        paymentRepository0.saveAll(paymentTransactionList86);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional48);
        org.junit.Assert.assertNotNull(paymentTransactionOptional51);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionOptional61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(paymentTransactionList69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(paymentTransactionOptional77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList84);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository8.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository8.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository8.findAll();
        paymentRepository0.saveAll(paymentTransactionList13);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        paymentRepository5.saveAll(paymentTransactionList18);
        paymentRepository0.saveAll(paymentTransactionList18);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentRepository21.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional25 = paymentRepository21.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository26 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet29);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentRepository26.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository34 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository34.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet37);
        com.yorku.lab.repository.PaymentRepository paymentRepository42 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository42.findByReservationIds((java.util.Set<java.lang.String>) strSet45);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional49 = paymentRepository42.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository50 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository50.findByReservationIds((java.util.Set<java.lang.String>) strSet53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository42.findByReservationIds((java.util.Set<java.lang.String>) strSet53);
        paymentRepository21.saveAll(paymentTransactionList56);
        java.util.Set<java.lang.String> strSet58 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository21.findByReservationIds(strSet58);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional6 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.repository.PaymentRepository paymentRepository35 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional37 = paymentRepository35.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository38 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        paymentRepository38.saveAll(paymentTransactionList44);
        paymentRepository35.saveAll(paymentTransactionList44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository35.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository51 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional53 = paymentRepository51.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentRepository51.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository51.findAll();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository51.findByReservationIds((java.util.Set<java.lang.String>) strSet59);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet59);
        com.yorku.lab.repository.PaymentRepository paymentRepository63 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository63.findByReservationIds((java.util.Set<java.lang.String>) strSet66);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional70 = paymentRepository63.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository71 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentRepository71.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList77 = paymentRepository63.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList78 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentRepository35.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet74);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList81 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionOptional37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional53);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(paymentTransactionOptional70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(paymentTransactionList77);
        org.junit.Assert.assertNotNull(paymentTransactionList78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
        org.junit.Assert.assertNotNull(paymentTransactionList81);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet31 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository0.findByReservationIds(strSet31);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional3 = paymentRepository1.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository1.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository6 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository6.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository14 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository14.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository6.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList21 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet17);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository26 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository26.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository26.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet34);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional38 = paymentRepository31.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository39.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository26.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        com.yorku.lab.repository.PaymentRepository paymentRepository48 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional50 = paymentRepository48.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional52 = paymentRepository48.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList58 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet56);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository53.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList66 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList67 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList68 = paymentRepository48.findByReservationIds((java.util.Set<java.lang.String>) strSet64);
        com.yorku.lab.repository.PaymentRepository paymentRepository69 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet72);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional76 = paymentRepository69.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository77 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList82 = paymentRepository77.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList83 = paymentRepository69.findByReservationIds((java.util.Set<java.lang.String>) strSet80);
        paymentRepository48.saveAll(paymentTransactionList83);
        java.util.Set<java.lang.String> strSet85 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository48.findByReservationIds(strSet85);
        paymentRepository25.saveAll(paymentTransactionList86);
        paymentRepository0.saveAll(paymentTransactionList86);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional90 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList91 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional3);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionList21);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionOptional38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionOptional50);
        org.junit.Assert.assertNotNull(paymentTransactionOptional52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList58);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList66);
        org.junit.Assert.assertNotNull(paymentTransactionList67);
        org.junit.Assert.assertNotNull(paymentTransactionList68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionOptional76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList82);
        org.junit.Assert.assertNotNull(paymentTransactionList83);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
        org.junit.Assert.assertNotNull(paymentTransactionOptional90);
        org.junit.Assert.assertNotNull(paymentTransactionList91);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.Set<java.lang.String> strSet7 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository3.findByReservationIds(strSet7);
        com.yorku.lab.repository.PaymentRepository paymentRepository9 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository9.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList15 = paymentRepository12.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentRepository12.findAll();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        com.yorku.lab.repository.PaymentRepository paymentRepository24 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet27);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional31 = paymentRepository24.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional48 = paymentRepository41.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository49 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList54 = paymentRepository49.findByReservationIds((java.util.Set<java.lang.String>) strSet52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList55 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet52);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet52);
        paymentRepository0.saveAll(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionList15);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionOptional31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionOptional48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList54);
        org.junit.Assert.assertNotNull(paymentTransactionList55);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository16.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository16.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList36 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository1 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository1.findByReservationIds((java.util.Set<java.lang.String>) strSet4);
        paymentRepository0.saveAll(paymentTransactionList6);
        java.util.Set<java.lang.String> strSet8 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository0.findByReservationIds(strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.saveAll(paymentTransactionList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        com.yorku.lab.repository.PaymentRepository paymentRepository39 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional41 = paymentRepository39.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray42 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList43, paymentTransactionArray42);
        paymentRepository39.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList43);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional47 = paymentRepository39.findById("hi!");
        java.util.Set<java.lang.String> strSet48 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentRepository39.findByReservationIds(strSet48);
        java.util.Set<java.lang.String> strSet50 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository39.findByReservationIds(strSet50);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository39.findAll();
        paymentRepository0.saveAll(paymentTransactionList52);
        java.lang.Class<?> wildcardClass54 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional41);
        org.junit.Assert.assertNotNull(paymentTransactionArray42);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray42, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional47);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Set<java.lang.String> strSet6 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository0.findByReservationIds(strSet6);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository10 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository10.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentRepository13.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentRepository13.findAll();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList24 = paymentRepository10.findByReservationIds((java.util.Set<java.lang.String>) strSet21);
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional27 = paymentRepository25.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional30 = paymentRepository28.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository28.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository28.findAll();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList40 = paymentRepository10.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        paymentRepository0.saveAll(paymentTransactionList40);
        com.yorku.lab.model.PaymentTransaction paymentTransaction42 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(paymentTransactionList24);
        org.junit.Assert.assertNotNull(paymentTransactionOptional27);
        org.junit.Assert.assertNotNull(paymentTransactionOptional30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
        org.junit.Assert.assertNotNull(paymentTransactionList40);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional5 = paymentRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList6 = paymentRepository3.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList7 = paymentRepository3.findAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList13 = paymentRepository3.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet11);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository32 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository32.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList39 = paymentRepository0.findAll();
        com.yorku.lab.model.PaymentTransaction paymentTransaction40 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional5);
        org.junit.Assert.assertNotNull(paymentTransactionList6);
        org.junit.Assert.assertNotNull(paymentTransactionList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList13);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionList39);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList12 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional15 = paymentRepository13.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository16 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository16.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository16.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository16.findAll();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository16.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        com.yorku.lab.repository.PaymentRepository paymentRepository28 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet31);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional35 = paymentRepository28.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList42 = paymentRepository28.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList43 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional46 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository0.findAll();
        java.lang.Class<?> wildcardClass48 = paymentTransactionList47.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionList12);
        org.junit.Assert.assertNotNull(paymentTransactionOptional15);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionList42);
        org.junit.Assert.assertNotNull(paymentTransactionList43);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionOptional46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional43 = paymentRepository41.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray44 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList45, paymentTransactionArray44);
        paymentRepository41.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList45);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional49 = paymentRepository41.findById("hi!");
        java.util.Set<java.lang.String> strSet50 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository41.findByReservationIds(strSet50);
        com.yorku.lab.repository.PaymentRepository paymentRepository52 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository53 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional55 = paymentRepository53.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional57 = paymentRepository53.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet61);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional65 = paymentRepository58.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository66 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList71 = paymentRepository66.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList73 = paymentRepository53.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList74 = paymentRepository52.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList75 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList76 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList77 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(paymentTransactionOptional43);
        org.junit.Assert.assertNotNull(paymentTransactionArray44);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray44, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional49);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionOptional55);
        org.junit.Assert.assertNotNull(paymentTransactionOptional57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList71);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionList73);
        org.junit.Assert.assertNotNull(paymentTransactionList74);
        org.junit.Assert.assertNotNull(paymentTransactionList75);
        org.junit.Assert.assertNotNull(paymentTransactionList76);
        org.junit.Assert.assertNotNull(paymentTransactionList77);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional9 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional11 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        com.yorku.lab.repository.PaymentRepository paymentRepository33 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet36);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional40 = paymentRepository33.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository41 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList46 = paymentRepository41.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList47 = paymentRepository33.findByReservationIds((java.util.Set<java.lang.String>) strSet44);
        paymentRepository12.saveAll(paymentTransactionList47);
        java.util.Set<java.lang.String> strSet49 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository12.findByReservationIds(strSet49);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList56 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList57 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet54);
        com.yorku.lab.repository.PaymentRepository paymentRepository58 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional60 = paymentRepository58.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository61 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional63 = paymentRepository61.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList64 = paymentRepository61.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList65 = paymentRepository61.findAll();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList71 = paymentRepository61.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList72 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet69);
        com.yorku.lab.repository.PaymentRepository paymentRepository73 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional75 = paymentRepository73.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository76 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional78 = paymentRepository76.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList79 = paymentRepository76.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList80 = paymentRepository76.findAll();
        java.lang.String[] strArray83 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList86 = paymentRepository76.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList87 = paymentRepository73.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList88 = paymentRepository58.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList89 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet84);
        com.yorku.lab.model.PaymentTransaction paymentTransaction90 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(paymentTransactionOptional40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList46);
        org.junit.Assert.assertNotNull(paymentTransactionList47);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList56);
        org.junit.Assert.assertNotNull(paymentTransactionList57);
        org.junit.Assert.assertNotNull(paymentTransactionOptional60);
        org.junit.Assert.assertNotNull(paymentTransactionOptional63);
        org.junit.Assert.assertNotNull(paymentTransactionList64);
        org.junit.Assert.assertNotNull(paymentTransactionList65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList71);
        org.junit.Assert.assertNotNull(paymentTransactionList72);
        org.junit.Assert.assertNotNull(paymentTransactionOptional75);
        org.junit.Assert.assertNotNull(paymentTransactionOptional78);
        org.junit.Assert.assertNotNull(paymentTransactionList79);
        org.junit.Assert.assertNotNull(paymentTransactionList80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList86);
        org.junit.Assert.assertNotNull(paymentTransactionList87);
        org.junit.Assert.assertNotNull(paymentTransactionList88);
        org.junit.Assert.assertNotNull(paymentTransactionList89);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList11 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray15 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList16, paymentTransactionArray15);
        paymentRepository12.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList16);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional20 = paymentRepository12.findById("hi!");
        java.util.Set<java.lang.String> strSet21 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository12.findByReservationIds(strSet21);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList23 = paymentRepository12.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository24 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentRepository24.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray27 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList28, paymentTransactionArray27);
        paymentRepository24.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList28);
        com.yorku.lab.repository.PaymentRepository paymentRepository31 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional33 = paymentRepository31.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository34 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional36 = paymentRepository34.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList37 = paymentRepository34.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository34.findAll();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList44 = paymentRepository34.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList45 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet42);
        com.yorku.lab.repository.PaymentRepository paymentRepository46 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional48 = paymentRepository46.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository49 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional51 = paymentRepository49.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository49.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList53 = paymentRepository49.findAll();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList59 = paymentRepository49.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList60 = paymentRepository46.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList61 = paymentRepository31.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList62 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet57);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList63 = paymentRepository24.findAll();
        paymentRepository12.saveAll(paymentTransactionList63);
        paymentRepository0.saveAll(paymentTransactionList63);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionList11);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionArray15);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray15, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional20);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionList23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
        org.junit.Assert.assertNotNull(paymentTransactionArray27);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray27, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional33);
        org.junit.Assert.assertNotNull(paymentTransactionOptional36);
        org.junit.Assert.assertNotNull(paymentTransactionList37);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList44);
        org.junit.Assert.assertNotNull(paymentTransactionList45);
        org.junit.Assert.assertNotNull(paymentTransactionOptional48);
        org.junit.Assert.assertNotNull(paymentTransactionOptional51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionList53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList59);
        org.junit.Assert.assertNotNull(paymentTransactionList60);
        org.junit.Assert.assertNotNull(paymentTransactionList61);
        org.junit.Assert.assertNotNull(paymentTransactionList62);
        org.junit.Assert.assertNotNull(paymentTransactionList63);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository3 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository4 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList9 = paymentRepository4.findByReservationIds((java.util.Set<java.lang.String>) strSet7);
        paymentRepository3.saveAll(paymentTransactionList9);
        paymentRepository0.saveAll(paymentTransactionList9);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional13 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList9);
        org.junit.Assert.assertNotNull(paymentTransactionOptional13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList8 = paymentRepository0.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository9 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList14 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet12);
        com.yorku.lab.repository.PaymentRepository paymentRepository15 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet18);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional22 = paymentRepository15.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository23 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository23.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList29 = paymentRepository15.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository9.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet26);
        java.lang.Class<?> wildcardClass32 = paymentTransactionList31.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionList8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(paymentTransactionList29);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        com.yorku.lab.model.PaymentTransaction[] paymentTransactionArray3 = new com.yorku.lab.model.PaymentTransaction[] {};
        java.util.ArrayList<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = new java.util.ArrayList<com.yorku.lab.model.PaymentTransaction>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4, paymentTransactionArray3);
        paymentRepository0.saveAll((java.util.List<com.yorku.lab.model.PaymentTransaction>) paymentTransactionList4);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional8 = paymentRepository0.findById("hi!");
        java.util.Set<java.lang.String> strSet9 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds(strSet9);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional14 = paymentRepository12.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional16 = paymentRepository12.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository17 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList22 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet20);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional24 = paymentRepository17.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository25 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList30 = paymentRepository25.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList31 = paymentRepository17.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList32 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList33 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet28);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional36 = paymentRepository0.findById("");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionArray3);
        org.junit.Assert.assertArrayEquals(paymentTransactionArray3, new com.yorku.lab.model.PaymentTransaction[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paymentTransactionOptional8);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional14);
        org.junit.Assert.assertNotNull(paymentTransactionOptional16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList22);
        org.junit.Assert.assertNotNull(paymentTransactionOptional24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList30);
        org.junit.Assert.assertNotNull(paymentTransactionList31);
        org.junit.Assert.assertNotNull(paymentTransactionList32);
        org.junit.Assert.assertNotNull(paymentTransactionList33);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionOptional36);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional4 = paymentRepository0.findById("");
        com.yorku.lab.repository.PaymentRepository paymentRepository5 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional12 = paymentRepository5.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository13 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList18 = paymentRepository13.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository5.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet16);
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList26 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet24);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional28 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository29 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository29.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        paymentRepository0.saveAll(paymentTransactionList35);
        java.util.Set<java.lang.String> strSet37 = null;
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList38 = paymentRepository0.findByReservationIds(strSet37);
        java.lang.Class<?> wildcardClass39 = paymentRepository0.getClass();
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionOptional4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(paymentTransactionOptional12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList26);
        org.junit.Assert.assertNotNull(paymentTransactionOptional28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(paymentTransactionList38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList5 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet3);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional7 = paymentRepository0.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository8 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional10 = paymentRepository8.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        com.yorku.lab.repository.PaymentRepository paymentRepository12 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList17 = paymentRepository12.findByReservationIds((java.util.Set<java.lang.String>) strSet15);
        paymentRepository11.saveAll(paymentTransactionList17);
        paymentRepository8.saveAll(paymentTransactionList17);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList20 = paymentRepository8.findAll();
        com.yorku.lab.repository.PaymentRepository paymentRepository21 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional23 = paymentRepository21.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository24 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional26 = paymentRepository24.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList27 = paymentRepository24.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList28 = paymentRepository24.findAll();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList34 = paymentRepository24.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList35 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet32);
        com.yorku.lab.repository.PaymentRepository paymentRepository36 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList41 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet39);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional43 = paymentRepository36.findById("hi!");
        com.yorku.lab.repository.PaymentRepository paymentRepository44 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList49 = paymentRepository44.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList50 = paymentRepository36.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList51 = paymentRepository21.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList52 = paymentRepository8.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList53 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet47);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList5);
        org.junit.Assert.assertNotNull(paymentTransactionOptional7);
        org.junit.Assert.assertNotNull(paymentTransactionOptional10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList17);
        org.junit.Assert.assertNotNull(paymentTransactionList20);
        org.junit.Assert.assertNotNull(paymentTransactionOptional23);
        org.junit.Assert.assertNotNull(paymentTransactionOptional26);
        org.junit.Assert.assertNotNull(paymentTransactionList27);
        org.junit.Assert.assertNotNull(paymentTransactionList28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList34);
        org.junit.Assert.assertNotNull(paymentTransactionList35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList41);
        org.junit.Assert.assertNotNull(paymentTransactionOptional43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList49);
        org.junit.Assert.assertNotNull(paymentTransactionList50);
        org.junit.Assert.assertNotNull(paymentTransactionList51);
        org.junit.Assert.assertNotNull(paymentTransactionList52);
        org.junit.Assert.assertNotNull(paymentTransactionList53);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.save(paymentTransaction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.PaymentTransaction.getTransactionId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList10 = paymentRepository0.findByReservationIds((java.util.Set<java.lang.String>) strSet8);
        com.yorku.lab.repository.PaymentRepository paymentRepository11 = new com.yorku.lab.repository.PaymentRepository();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList16 = paymentRepository11.findByReservationIds((java.util.Set<java.lang.String>) strSet14);
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional18 = paymentRepository11.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList19 = paymentRepository11.findAll();
        paymentRepository0.saveAll(paymentTransactionList19);
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paymentTransactionList16);
        org.junit.Assert.assertNotNull(paymentTransactionOptional18);
        org.junit.Assert.assertNotNull(paymentTransactionList19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.repository.PaymentRepository paymentRepository0 = new com.yorku.lab.repository.PaymentRepository();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional2 = paymentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList3 = paymentRepository0.findAll();
        java.util.List<com.yorku.lab.model.PaymentTransaction> paymentTransactionList4 = paymentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.PaymentTransaction> paymentTransactionOptional6 = paymentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(paymentTransactionOptional2);
        org.junit.Assert.assertNotNull(paymentTransactionList3);
        org.junit.Assert.assertNotNull(paymentTransactionList4);
        org.junit.Assert.assertNotNull(paymentTransactionOptional6);
    }
}

