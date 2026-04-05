package com.yorku.lab.pattern.strategy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResearcherPricingStrategyRegressionTest0 {

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
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass7 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass6 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-20.0d) + "'", double8 == (-20.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass8 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        java.lang.Class<?> wildcardClass5 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateDeposit(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        java.lang.Class<?> wildcardClass7 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        java.lang.Class<?> wildcardClass7 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateDeposit((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2000.0d + "'", double8 == 2000.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((-1));
        java.lang.Class<?> wildcardClass14 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass7 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((-1));
        double double15 = researcherPricingStrategy0.calculateTotalFee((double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1940.0d + "'", double15 == 1940.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateTotalFee(200.0d);
        java.lang.Class<?> wildcardClass3 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4000.0d + "'", double2 == 4000.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass14 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) 100L);
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2000.0d + "'", double11 == 2000.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double13 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateTotalFee(200.0d);
        double double3 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4000.0d + "'", double2 == 4000.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateTotalFee(200.0d);
        double double4 = researcherPricingStrategy0.calculateTotalFee((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4000.0d + "'", double2 == 4000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass13 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateDeposit(0);
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateTotalFee((double) 10L);
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        double double16 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        double double11 = researcherPricingStrategy0.calculateDeposit((int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        double double9 = researcherPricingStrategy0.calculateTotalFee((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2000.0d + "'", double7 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-20.0d) + "'", double9 == (-20.0d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = researcherPricingStrategy0.calculateTotalFee(4000.0d);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 80000.0d + "'", double8 == 80000.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double16 = researcherPricingStrategy0.calculateDeposit((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        double double13 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateTotalFee(200.0d);
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4000.0d + "'", double11 == 4000.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) 0L);
        java.lang.Class<?> wildcardClass8 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (short) 0);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-20.0d) + "'", double8 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-20.0d) + "'", double8 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double12 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = researcherPricingStrategy0.calculateTotalFee(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 200.0d + "'", double14 == 200.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((-1));
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        double double15 = researcherPricingStrategy0.calculateHourlyRate();
        double double17 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateTotalFee(20.0d);
        double double15 = researcherPricingStrategy0.calculateDeposit((int) '#');
        double double17 = researcherPricingStrategy0.calculateTotalFee((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 400.0d + "'", double13 == 400.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double10 = researcherPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-20.0d) + "'", double8 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (short) 0);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) 10.0f);
        double double10 = researcherPricingStrategy0.calculateDeposit(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double15 = researcherPricingStrategy0.calculateHourlyRate();
        double double16 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (short) 10);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateTotalFee((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        java.lang.Class<?> wildcardClass8 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2000.0d + "'", double7 == 2000.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2000.0d + "'", double8 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (short) 0);
        double double12 = researcherPricingStrategy0.calculateTotalFee((-1.0d));
        double double14 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-20.0d) + "'", double12 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass15 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double13 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        double double11 = researcherPricingStrategy0.calculateTotalFee((-20.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-400.0d) + "'", double11 == (-400.0d));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2000.0d + "'", double11 == 2000.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateTotalFee(2000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40000.0d + "'", double12 == 40000.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double1 = researcherPricingStrategy0.calculateHourlyRate();
        double double3 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateDeposit((int) '4');
        java.lang.Class<?> wildcardClass15 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double12 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double13 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateTotalFee((-20.0d));
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-400.0d) + "'", double9 == (-400.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double6 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 700.0d + "'", double8 == 700.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double10 = researcherPricingStrategy0.calculateTotalFee((-20.0d));
        double double12 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-400.0d) + "'", double10 == (-400.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) 0L);
        double double9 = researcherPricingStrategy0.calculateTotalFee(20.0d);
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 400.0d + "'", double9 == 400.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2000.0d + "'", double9 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double15 = researcherPricingStrategy0.calculateHourlyRate();
        double double17 = researcherPricingStrategy0.calculateTotalFee(700.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 14000.0d + "'", double17 == 14000.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double15 = researcherPricingStrategy0.calculateTotalFee((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 200.0d + "'", double15 == 200.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double13 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double15 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) 100L);
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass14 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2000.0d + "'", double11 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((-1));
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass15 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double10 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        double double13 = researcherPricingStrategy0.calculateDeposit(0);
        double double15 = researcherPricingStrategy0.calculateDeposit((-1));
        java.lang.Class<?> wildcardClass16 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateDeposit(0);
        double double10 = researcherPricingStrategy0.calculateDeposit((-1));
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double10 = researcherPricingStrategy0.calculateTotalFee((-400.0d));
        double double12 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8000.0d) + "'", double10 == (-8000.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) 0L);
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double13 = researcherPricingStrategy0.calculateDeposit((-1));
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        double double15 = researcherPricingStrategy0.calculateHourlyRate();
        double double16 = researcherPricingStrategy0.calculateHourlyRate();
        double double17 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        double double13 = researcherPricingStrategy0.calculateDeposit(0);
        double double15 = researcherPricingStrategy0.calculateDeposit((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) 'a');
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1940.0d + "'", double11 == 1940.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 1);
        double double10 = researcherPricingStrategy0.calculateTotalFee(700.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 14000.0d + "'", double10 == 14000.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) 10.0f);
        double double10 = researcherPricingStrategy0.calculateTotalFee(40000.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 800000.0d + "'", double10 == 800000.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) '4');
        java.lang.Class<?> wildcardClass10 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (short) 0);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        double double13 = researcherPricingStrategy0.calculateDeposit(0);
        double double15 = researcherPricingStrategy0.calculateDeposit((-1));
        double double17 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateTotalFee(20.0d);
        double double15 = researcherPricingStrategy0.calculateDeposit((int) '#');
        double double17 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 400.0d + "'", double13 == 400.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double12 = researcherPricingStrategy0.calculateTotalFee(4000.0d);
        double double14 = researcherPricingStrategy0.calculateTotalFee((double) 0L);
        double double16 = researcherPricingStrategy0.calculateTotalFee(2000.0d);
        double double18 = researcherPricingStrategy0.calculateTotalFee(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-20.0d) + "'", double8 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1040.0d + "'", double10 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 80000.0d + "'", double12 == 80000.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40000.0d + "'", double16 == 40000.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateDeposit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateTotalFee((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2000.0d + "'", double7 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) 100);
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2000.0d + "'", double8 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) 100);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2000.0d + "'", double8 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) 'a');
        double double13 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1940.0d + "'", double11 == 1940.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass8 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateTotalFee(2000.0d);
        double double15 = researcherPricingStrategy0.calculateTotalFee((-400.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40000.0d + "'", double13 == 40000.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-8000.0d) + "'", double15 == (-8000.0d));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) 0L);
        double double9 = researcherPricingStrategy0.calculateTotalFee(20.0d);
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass12 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 400.0d + "'", double9 == 400.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        double double11 = researcherPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double13 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateTotalFee((double) 'a');
        double double13 = researcherPricingStrategy0.calculateTotalFee(700.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1940.0d + "'", double11 == 1940.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14000.0d + "'", double13 == 14000.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateTotalFee(200.0d);
        double double13 = researcherPricingStrategy0.calculateDeposit(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4000.0d + "'", double11 == 4000.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double9 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = researcherPricingStrategy0.calculateDeposit(0);
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1040.0d + "'", double7 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double13 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        java.lang.Class<?> wildcardClass14 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2000.0d + "'", double13 == 2000.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (short) 0);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double12 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = researcherPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double16 = researcherPricingStrategy0.calculateDeposit((int) (byte) 0);
        double double17 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.0d) + "'", double10 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double1 = researcherPricingStrategy0.calculateHourlyRate();
        double double3 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        double double4 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2000.0d + "'", double3 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double8 = researcherPricingStrategy0.calculateDeposit(0);
        double double10 = researcherPricingStrategy0.calculateDeposit((-1));
        double double12 = researcherPricingStrategy0.calculateTotalFee(20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 400.0d + "'", double12 == 400.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(100.0d);
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2000.0d + "'", double7 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double13 = researcherPricingStrategy0.calculateTotalFee(700.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 14000.0d + "'", double13 == 14000.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) '4');
        double double12 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double14 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double15 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-20.0d) + "'", double8 == (-20.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1040.0d + "'", double10 == 1040.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double11 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        double double13 = researcherPricingStrategy0.calculateTotalFee((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 0);
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double5 = researcherPricingStrategy0.calculateHourlyRate();
        double double7 = researcherPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = researcherPricingStrategy0.calculateDeposit(0);
        double double11 = researcherPricingStrategy0.calculateDeposit((int) ' ');
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(0);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) (short) 0);
        double double12 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double14 = researcherPricingStrategy0.calculateTotalFee((double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2000.0d + "'", double14 == 2000.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double9 = researcherPricingStrategy0.calculateHourlyRate();
        double double10 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) (short) 1);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double12 = researcherPricingStrategy0.calculateTotalFee((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 200.0d + "'", double12 == 200.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double7 = researcherPricingStrategy0.calculateHourlyRate();
        double double8 = researcherPricingStrategy0.calculateHourlyRate();
        double double10 = researcherPricingStrategy0.calculateTotalFee(0.0d);
        java.lang.Class<?> wildcardClass11 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateTotalFee(200.0d);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4000.0d + "'", double2 == 4000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit(1);
        double double8 = researcherPricingStrategy0.calculateTotalFee(1.0d);
        double double10 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double13 = researcherPricingStrategy0.calculateTotalFee(20.0d);
        double double15 = researcherPricingStrategy0.calculateDeposit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 400.0d + "'", double13 == 400.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit(0);
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = researcherPricingStrategy0.calculateTotalFee((double) 10.0f);
        double double10 = researcherPricingStrategy0.calculateTotalFee(1940.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 38800.0d + "'", double10 == 38800.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.pattern.strategy.ResearcherPricingStrategy researcherPricingStrategy0 = new com.yorku.lab.pattern.strategy.ResearcherPricingStrategy();
        double double2 = researcherPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = researcherPricingStrategy0.calculateDeposit((int) 'a');
        double double6 = researcherPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double8 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double10 = researcherPricingStrategy0.calculateTotalFee((double) 100);
        double double11 = researcherPricingStrategy0.calculateHourlyRate();
        double double12 = researcherPricingStrategy0.calculateHourlyRate();
        double double14 = researcherPricingStrategy0.calculateDeposit((int) '4');
        double double15 = researcherPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass16 = researcherPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2000.0d + "'", double10 == 2000.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

