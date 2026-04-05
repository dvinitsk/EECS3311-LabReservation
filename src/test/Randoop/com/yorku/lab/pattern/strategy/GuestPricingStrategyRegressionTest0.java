package com.yorku.lab.pattern.strategy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GuestPricingStrategyRegressionTest0 {

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
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        java.lang.Class<?> wildcardClass1 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        java.lang.Class<?> wildcardClass5 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateTotalFee(1.0d);
        java.lang.Class<?> wildcardClass5 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        java.lang.Class<?> wildcardClass13 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateTotalFee((double) 100);
        java.lang.Class<?> wildcardClass7 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3000.0d + "'", double6 == 3000.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double7 = guestPricingStrategy0.calculateTotalFee((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-30.0d) + "'", double5 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double7 = guestPricingStrategy0.calculateDeposit((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-30.0d) + "'", double5 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double13 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = guestPricingStrategy0.calculateDeposit(1);
        java.lang.Class<?> wildcardClass8 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass15 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        java.lang.Class<?> wildcardClass3 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double7 = guestPricingStrategy0.calculateTotalFee((-1.0d));
        double double9 = guestPricingStrategy0.calculateTotalFee((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-30.0d) + "'", double7 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(300.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9000.0d + "'", double10 == 9000.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateDeposit(0);
        double double16 = guestPricingStrategy0.calculateTotalFee((double) 100L);
        double double18 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double20 = guestPricingStrategy0.calculateTotalFee(9000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3000.0d + "'", double16 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 270000.0d + "'", double20 == 270000.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass6 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = guestPricingStrategy0.calculateHourlyRate();
        double double13 = guestPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateDeposit(0);
        double double16 = guestPricingStrategy0.calculateTotalFee((double) 100L);
        double double18 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double20 = guestPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3000.0d + "'", double16 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double1 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double6 = guestPricingStrategy0.calculateTotalFee(300.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9000.0d + "'", double6 == 9000.0d);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double7 = guestPricingStrategy0.calculateTotalFee((-1.0d));
        double double8 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-30.0d) + "'", double7 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateTotalFee((double) 10);
        double double16 = guestPricingStrategy0.calculateDeposit(0);
        double double18 = guestPricingStrategy0.calculateDeposit((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 300.0d + "'", double14 == 300.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateTotalFee(1.0d);
        double double6 = guestPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double8 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-30.0d) + "'", double6 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateDeposit(0);
        double double7 = guestPricingStrategy0.calculateTotalFee((double) (short) 100);
        double double9 = guestPricingStrategy0.calculateTotalFee(3000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3000.0d + "'", double7 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90000.0d + "'", double9 == 90000.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateTotalFee((double) 100);
        double double8 = guestPricingStrategy0.calculateTotalFee((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3000.0d + "'", double6 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-30.0d) + "'", double8 == (-30.0d));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double13 = guestPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass14 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateTotalFee(1.0d);
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double6 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double7 = guestPricingStrategy0.calculateDeposit((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double10 = guestPricingStrategy0.calculateTotalFee((double) 100);
        double double12 = guestPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3000.0d + "'", double10 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double14 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateTotalFee((double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-30.0d) + "'", double14 == (-30.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass4 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateDeposit(0);
        double double7 = guestPricingStrategy0.calculateTotalFee((double) (short) 100);
        double double9 = guestPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = guestPricingStrategy0.calculateTotalFee((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3000.0d + "'", double7 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 300.0d + "'", double11 == 300.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double6 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300.0d + "'", double5 == 300.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateTotalFee((double) 100);
        double double7 = guestPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass8 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3000.0d + "'", double6 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee((double) (-1L));
        double double6 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-30.0d) + "'", double5 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double7 = guestPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = guestPricingStrategy0.calculateTotalFee(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 300.0d + "'", double9 == 300.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = guestPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double15 = guestPricingStrategy0.calculateHourlyRate();
        double double17 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateTotalFee((double) (-1.0f));
        double double16 = guestPricingStrategy0.calculateDeposit(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-30.0d) + "'", double14 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateDeposit(0);
        double double16 = guestPricingStrategy0.calculateTotalFee((double) 100L);
        double double17 = guestPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass18 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3000.0d + "'", double16 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double7 = guestPricingStrategy0.calculateTotalFee((-30.0d));
        double double9 = guestPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300.0d + "'", double5 == 300.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double7 = guestPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double8 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateTotalFee((double) 100);
        double double7 = guestPricingStrategy0.calculateHourlyRate();
        double double9 = guestPricingStrategy0.calculateDeposit((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3000.0d + "'", double6 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateTotalFee((double) 10);
        double double16 = guestPricingStrategy0.calculateTotalFee((double) (-1L));
        double double18 = guestPricingStrategy0.calculateTotalFee((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 300.0d + "'", double14 == 300.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-30.0d) + "'", double16 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = guestPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = guestPricingStrategy0.calculateDeposit(0);
        double double16 = guestPricingStrategy0.calculateTotalFee((double) 100L);
        double double18 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3000.0d + "'", double16 == 3000.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateDeposit(0);
        double double6 = guestPricingStrategy0.calculateHourlyRate();
        double double8 = guestPricingStrategy0.calculateDeposit((int) ' ');
        java.lang.Class<?> wildcardClass9 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit(1);
        double double10 = guestPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = guestPricingStrategy0.calculateHourlyRate();
        double double13 = guestPricingStrategy0.calculateDeposit((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = guestPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (short) 0);
        double double6 = guestPricingStrategy0.calculateTotalFee((double) 0);
        double double7 = guestPricingStrategy0.calculateHourlyRate();
        double double9 = guestPricingStrategy0.calculateTotalFee((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3000.0d + "'", double9 == 3000.0d);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double6 = guestPricingStrategy0.calculateTotalFee(270000.0d);
        double double8 = guestPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8100000.0d + "'", double6 == 8100000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = guestPricingStrategy0.calculateHourlyRate();
        double double5 = guestPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double7 = guestPricingStrategy0.calculateTotalFee((-30.0d));
        double double9 = guestPricingStrategy0.calculateTotalFee(8100000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1560.0d + "'", double2 == 1560.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300.0d + "'", double5 == 300.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.43E8d + "'", double9 == 2.43E8d);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateDeposit((int) '4');
        double double6 = guestPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double10 = guestPricingStrategy0.calculateDeposit((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateTotalFee(1.0d);
        double double5 = guestPricingStrategy0.calculateHourlyRate();
        double double7 = guestPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double8 = guestPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-30.0d) + "'", double7 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = guestPricingStrategy0.calculateTotalFee(1.0d);
        double double6 = guestPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double8 = guestPricingStrategy0.calculateTotalFee(8100000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-30.0d) + "'", double6 == (-30.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.43E8d + "'", double8 == 2.43E8d);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.pattern.strategy.GuestPricingStrategy guestPricingStrategy0 = new com.yorku.lab.pattern.strategy.GuestPricingStrategy();
        double double2 = guestPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double4 = guestPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }
}

