package com.yorku.lab.pattern.strategy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DebitPaymentStrategyRegressionTest0 {

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
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        java.lang.Class<?> wildcardClass1 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(10.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1));
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (short) 0);
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) '#');
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 'a');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1L);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 1);
        java.lang.Class<?> wildcardClass13 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) '#');
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 'a');
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1L));
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1L);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass13 = paymentTransaction12.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(10.0d);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '4');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass19 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
        org.junit.Assert.assertNotNull(paymentTransaction18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass13 = paymentTransaction12.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass13 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (short) 10);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 10L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1L));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 1L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 100);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 10);
        java.lang.Class<?> wildcardClass13 = paymentTransaction12.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass13 = paymentTransaction12.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) '#');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1L));
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 'a');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '4');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1L));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(100.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(10.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 0.0f);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 100);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1L));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 1.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(10.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1L));
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) (short) 100);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 'a');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 'a');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '4');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass13 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1L));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) '4');
        java.lang.Class<?> wildcardClass15 = paymentTransaction14.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '4');
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (short) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(100.0d);
        java.lang.Class<?> wildcardClass13 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) 1);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (short) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (byte) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 'a');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(100.0d);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1L));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1));
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 0L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (-1.0f));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1.0f);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay((double) (byte) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = debitPaymentStrategy0.pay((double) 10);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
        org.junit.Assert.assertNotNull(paymentTransaction18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay(1.0d);
        java.lang.Class<?> wildcardClass17 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 0L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay((double) (-1));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1L));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10.0f);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = paymentTransaction14.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 10L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass17 = paymentTransaction16.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) '4');
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay((double) ' ');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass15 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass15 = paymentTransaction14.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass17 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 100);
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay(10.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) '4');
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass17 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
        org.junit.Assert.assertNotNull(paymentTransaction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 100L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (-1L));
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) -1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) 0L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }
}

