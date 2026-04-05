package com.yorku.lab.pattern.strategy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyPricingStrategyRegressionTest0 {

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
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        java.lang.Class<?> wildcardClass1 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        java.lang.Class<?> wildcardClass5 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateTotalFee(1.0d);
        java.lang.Class<?> wildcardClass5 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        java.lang.Class<?> wildcardClass13 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) 100);
        java.lang.Class<?> wildcardClass7 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1500.0d + "'", double6 == 1500.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double7 = facultyPricingStrategy0.calculateTotalFee((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-15.0d) + "'", double5 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee((double) (byte) -1);
        double double7 = facultyPricingStrategy0.calculateDeposit((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-15.0d) + "'", double5 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double13 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double7 = facultyPricingStrategy0.calculateDeposit(1);
        java.lang.Class<?> wildcardClass8 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass15 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        java.lang.Class<?> wildcardClass3 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double7 = facultyPricingStrategy0.calculateTotalFee((-1.0d));
        double double9 = facultyPricingStrategy0.calculateTotalFee((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-15.0d) + "'", double7 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(150.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2250.0d + "'", double10 == 2250.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateDeposit(0);
        double double16 = facultyPricingStrategy0.calculateTotalFee((double) 100L);
        double double18 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double20 = facultyPricingStrategy0.calculateTotalFee(2250.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1500.0d + "'", double16 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 33750.0d + "'", double20 == 33750.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateDeposit(0);
        java.lang.Class<?> wildcardClass6 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = facultyPricingStrategy0.calculateHourlyRate();
        double double13 = facultyPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateDeposit(0);
        double double16 = facultyPricingStrategy0.calculateTotalFee((double) 100L);
        double double18 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double20 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1500.0d + "'", double16 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double1 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double6 = facultyPricingStrategy0.calculateTotalFee(150.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2250.0d + "'", double6 == 2250.0d);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double7 = facultyPricingStrategy0.calculateTotalFee((-1.0d));
        double double8 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-15.0d) + "'", double7 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateTotalFee((double) 10);
        double double16 = facultyPricingStrategy0.calculateDeposit(0);
        double double18 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 150.0d + "'", double14 == 150.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateTotalFee(1.0d);
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double8 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-15.0d) + "'", double6 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateDeposit(0);
        double double7 = facultyPricingStrategy0.calculateTotalFee((double) (short) 100);
        double double9 = facultyPricingStrategy0.calculateTotalFee(1500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1500.0d + "'", double7 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 22500.0d + "'", double9 == 22500.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) 100);
        double double8 = facultyPricingStrategy0.calculateTotalFee((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1500.0d + "'", double6 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-15.0d) + "'", double8 == (-15.0d));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double13 = facultyPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass14 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateTotalFee(1.0d);
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double6 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double7 = facultyPricingStrategy0.calculateDeposit((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double10 = facultyPricingStrategy0.calculateTotalFee((double) 100);
        double double12 = facultyPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1500.0d + "'", double10 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) (byte) 1);
        double double14 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateTotalFee((double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-15.0d) + "'", double14 == (-15.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass4 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateDeposit(0);
        double double7 = facultyPricingStrategy0.calculateTotalFee((double) (short) 100);
        double double9 = facultyPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double11 = facultyPricingStrategy0.calculateTotalFee((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1500.0d + "'", double7 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 150.0d + "'", double11 == 150.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double6 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 150.0d + "'", double5 == 150.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) 100);
        double double7 = facultyPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass8 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1500.0d + "'", double6 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee((double) (-1L));
        double double6 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-15.0d) + "'", double5 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double7 = facultyPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double9 = facultyPricingStrategy0.calculateTotalFee(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 150.0d + "'", double9 == 150.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double14 = facultyPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double15 = facultyPricingStrategy0.calculateHourlyRate();
        double double17 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateTotalFee((double) (-1.0f));
        double double16 = facultyPricingStrategy0.calculateDeposit(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-15.0d) + "'", double14 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateDeposit(0);
        double double16 = facultyPricingStrategy0.calculateTotalFee((double) 100L);
        double double17 = facultyPricingStrategy0.calculateHourlyRate();
        java.lang.Class<?> wildcardClass18 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1500.0d + "'", double16 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double7 = facultyPricingStrategy0.calculateTotalFee((-15.0d));
        double double9 = facultyPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 150.0d + "'", double5 == 150.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-225.0d) + "'", double7 == (-225.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double7 = facultyPricingStrategy0.calculateDeposit((int) (byte) 100);
        double double8 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) 100);
        double double7 = facultyPricingStrategy0.calculateHourlyRate();
        double double9 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1500.0d + "'", double6 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateTotalFee((double) 10);
        double double16 = facultyPricingStrategy0.calculateTotalFee((double) (-1L));
        double double18 = facultyPricingStrategy0.calculateTotalFee((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 150.0d + "'", double14 == 150.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-15.0d) + "'", double16 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double12 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        double double14 = facultyPricingStrategy0.calculateDeposit(0);
        double double16 = facultyPricingStrategy0.calculateTotalFee((double) 100L);
        double double18 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1500.0d + "'", double16 == 1500.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateDeposit(0);
        double double6 = facultyPricingStrategy0.calculateHourlyRate();
        double double8 = facultyPricingStrategy0.calculateDeposit((int) ' ');
        java.lang.Class<?> wildcardClass9 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit(1);
        double double10 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        double double11 = facultyPricingStrategy0.calculateHourlyRate();
        double double13 = facultyPricingStrategy0.calculateDeposit((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = facultyPricingStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (short) 0);
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) 0);
        double double7 = facultyPricingStrategy0.calculateHourlyRate();
        double double9 = facultyPricingStrategy0.calculateTotalFee((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1500.0d + "'", double9 == 1500.0d);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) (byte) 10);
        double double6 = facultyPricingStrategy0.calculateTotalFee(33750.0d);
        double double8 = facultyPricingStrategy0.calculateTotalFee(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 506250.0d + "'", double6 == 506250.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateTotalFee((double) '4');
        double double3 = facultyPricingStrategy0.calculateHourlyRate();
        double double5 = facultyPricingStrategy0.calculateTotalFee((double) (short) 10);
        double double7 = facultyPricingStrategy0.calculateTotalFee((-15.0d));
        double double9 = facultyPricingStrategy0.calculateTotalFee(506250.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 780.0d + "'", double2 == 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 150.0d + "'", double5 == 150.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-225.0d) + "'", double7 == (-225.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7593750.0d + "'", double9 == 7593750.0d);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit((int) '4');
        double double6 = facultyPricingStrategy0.calculateDeposit((int) (short) 100);
        double double8 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double10 = facultyPricingStrategy0.calculateDeposit((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateTotalFee(1.0d);
        double double5 = facultyPricingStrategy0.calculateHourlyRate();
        double double7 = facultyPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double8 = facultyPricingStrategy0.calculateHourlyRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-15.0d) + "'", double7 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (short) -1);
        double double4 = facultyPricingStrategy0.calculateTotalFee(1.0d);
        double double6 = facultyPricingStrategy0.calculateTotalFee((double) (short) -1);
        double double8 = facultyPricingStrategy0.calculateTotalFee(506250.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-15.0d) + "'", double6 == (-15.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7593750.0d + "'", double8 == 7593750.0d);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.pattern.strategy.FacultyPricingStrategy facultyPricingStrategy0 = new com.yorku.lab.pattern.strategy.FacultyPricingStrategy();
        double double2 = facultyPricingStrategy0.calculateDeposit((int) (byte) -1);
        double double4 = facultyPricingStrategy0.calculateDeposit(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }
}

