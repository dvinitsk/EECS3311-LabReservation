package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsageRecordRegressionTest0 {

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
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass7 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.Class<?> wildcardClass6 = usageRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.Class<?> wildcardClass6 = usageRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = operationalStatus6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass7 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = operationalStatus7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.String str10 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        java.lang.String str8 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        java.lang.Class<?> wildcardClass6 = usageRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = operationalStatus7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(operationalStatus7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = operationalStatus10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass7 = usageRecord5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        boolean boolean9 = usageRecord5.isInUse();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = equipment9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.String str10 = usageRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(operationalStatus7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = operationalStatus10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDateTime7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDateTime9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        boolean boolean9 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.String str11 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = operationalStatus11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(operationalStatus11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        java.lang.String str11 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        java.lang.String str11 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.lang.String str8 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = equipment9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass12 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(operationalStatus11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        java.lang.String str7 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(operationalStatus11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        boolean boolean8 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        boolean boolean11 = usageRecord5.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        boolean boolean9 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(equipment8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.String str9 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        boolean boolean12 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(operationalStatus11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.String str9 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        java.lang.String str12 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(operationalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.String str10 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(operationalStatus11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(equipment8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDateTime11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(equipment7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime12 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass13 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass7 = usageRecord5.getClass();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = operationalStatus10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = equipment9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, true, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(operationalStatus11);
        org.junit.Assert.assertNull(operationalStatus12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.String str8 = usageRecord5.getRecordId();
        java.lang.String str9 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.lang.String str12 = usageRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.lang.String str10 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(operationalStatus11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime12 = usageRecord5.getTimestamp();
        boolean boolean13 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment14 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        boolean boolean11 = usageRecord5.isInUse();
        boolean boolean12 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        boolean boolean8 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime12 = usageRecord5.getTimestamp();
        boolean boolean13 = usageRecord5.isInUse();
        java.lang.String str14 = usageRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        java.lang.String str12 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.String str10 = usageRecord5.getRecordId();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime12 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = usageRecord5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(operationalStatus13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime12 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment13 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(operationalStatus11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(operationalStatus11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, true, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        boolean boolean13 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        boolean boolean8 = usageRecord5.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = equipment12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.String str10 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(equipment8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = operationalStatus10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(operationalStatus11);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        boolean boolean8 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDateTime9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        java.lang.String str12 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.lang.String str10 = usageRecord5.getRecordId();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime12 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment13 = usageRecord5.getEquipment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        boolean boolean11 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        java.lang.String str11 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        java.lang.String str13 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass12 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.time.LocalDateTime localDateTime6 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        boolean boolean11 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = usageRecord5.getStatus();
        boolean boolean13 = usageRecord5.isInUse();
        java.lang.String str14 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(operationalStatus12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass12 = usageRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(operationalStatus11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, true, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(equipment7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        boolean boolean9 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        boolean boolean11 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operationalStatus10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, true, operationalStatus4);
        java.lang.Class<?> wildcardClass6 = usageRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

