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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        java.lang.Class<?> wildcardClass1 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(1.0d);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(1.0d);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10L);
        java.lang.Class<?> wildcardClass11 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10.0f);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(10.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(100.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(100.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10.0f);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(100.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 100L);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (short) 100);
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1L));
        java.lang.Class<?> wildcardClass3 = paymentTransaction2.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(100.0d);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(1.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (byte) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0.0f);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(100.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (short) 100);
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(100.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 1);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 10L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(1.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass9 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(10.0d);
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(1.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((-1.0d));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass7 = paymentTransaction6.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay((double) (-1L));
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10.0f);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(1.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) ' ');
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 10L);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (short) 0);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10L);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) 10);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 100L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay(1.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (byte) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 10L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = debitPaymentStrategy0.pay((double) 'a');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(paymentTransaction12);
        org.junit.Assert.assertNotNull(paymentTransaction14);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) '4');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 1L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '4');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass9 = paymentTransaction8.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (short) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) (short) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) ' ');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (short) 0);
        java.lang.Class<?> wildcardClass3 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(0.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 100);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) '#');
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 0L);
        java.lang.Class<?> wildcardClass11 = paymentTransaction10.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((-1.0d));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) (byte) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) (short) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) '4');
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) 1L);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay(0.0d);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay((double) 10);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) 0L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction8 = debitPaymentStrategy0.pay((double) 1L);
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = debitPaymentStrategy0.pay((double) (short) -1);
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(paymentTransaction8);
        org.junit.Assert.assertNotNull(paymentTransaction10);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
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
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.yorku.lab.pattern.strategy.DebitPaymentStrategy debitPaymentStrategy0 = new com.yorku.lab.pattern.strategy.DebitPaymentStrategy();
        com.yorku.lab.model.PaymentTransaction paymentTransaction2 = debitPaymentStrategy0.pay((double) (-1.0f));
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = debitPaymentStrategy0.pay(10.0d);
        com.yorku.lab.model.PaymentTransaction paymentTransaction6 = debitPaymentStrategy0.pay((double) ' ');
        java.lang.Class<?> wildcardClass7 = debitPaymentStrategy0.getClass();
        org.junit.Assert.assertNotNull(paymentTransaction2);
        org.junit.Assert.assertNotNull(paymentTransaction4);
        org.junit.Assert.assertNotNull(paymentTransaction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

