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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.Class<?> wildcardClass6 = usageRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass8 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        boolean boolean6 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass7 = usageRecord5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = equipment6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        boolean boolean10 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass7 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        java.lang.String str8 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(operationalStatus7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(operationalStatus7);
        org.junit.Assert.assertNull(equipment8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, true, operationalStatus4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = usageRecord5.getStatus();
        boolean boolean7 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(operationalStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = operationalStatus8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        boolean boolean10 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        java.lang.String str8 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        boolean boolean11 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.Class<?> wildcardClass11 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, true, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime11 = usageRecord5.getTimestamp();
        java.lang.String str12 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        boolean boolean9 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDateTime10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        boolean boolean8 = usageRecord5.isInUse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment10 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.lang.String str8 = usageRecord5.getRecordId();
        boolean boolean9 = usageRecord5.isInUse();
        java.lang.Class<?> wildcardClass10 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        boolean boolean10 = usageRecord5.isInUse();
        java.lang.String str11 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = usageRecord5.getStatus();
        java.lang.String str13 = usageRecord5.getRecordId();
        java.lang.String str14 = usageRecord5.getRecordId();
        boolean boolean15 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(operationalStatus12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.lang.Class<?> wildcardClass9 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.lang.String str8 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = usageRecord5.getStatus();
        java.lang.String str13 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment14 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(operationalStatus12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        java.lang.String str6 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        java.time.LocalDateTime localDateTime8 = usageRecord5.getTimestamp();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        boolean boolean8 = usageRecord5.isInUse();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        java.lang.Class<?> wildcardClass12 = usageRecord5.getClass();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
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
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.time.LocalDateTime localDateTime7 = usageRecord5.getTimestamp();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = usageRecord5.getStatus();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(operationalStatus10);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        com.yorku.lab.model.Equipment equipment9 = usageRecord5.getEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = equipment9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.String str11 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment12 = usageRecord5.getEquipment();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        com.yorku.lab.model.Equipment equipment7 = usageRecord5.getEquipment();
        java.lang.String str8 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        boolean boolean7 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = usageRecord5.getStatus();
        java.time.LocalDateTime localDateTime9 = usageRecord5.getTimestamp();
        java.time.LocalDateTime localDateTime10 = usageRecord5.getTimestamp();
        java.lang.String str11 = usageRecord5.getRecordId();
        java.lang.String str12 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(operationalStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        com.yorku.lab.model.Equipment equipment8 = usageRecord5.getEquipment();
        java.lang.String str9 = usageRecord5.getRecordId();
        boolean boolean10 = usageRecord5.isInUse();
        com.yorku.lab.model.Equipment equipment11 = usageRecord5.getEquipment();
        boolean boolean12 = usageRecord5.isInUse();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.yorku.lab.model.Equipment equipment1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        com.yorku.lab.model.UsageRecord usageRecord5 = new com.yorku.lab.model.UsageRecord("hi!", equipment1, localDateTime2, false, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = usageRecord5.getEquipment();
        java.lang.String str7 = usageRecord5.getRecordId();
        boolean boolean8 = usageRecord5.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = usageRecord5.getStatus();
        java.lang.String str10 = usageRecord5.getRecordId();
        java.lang.String str11 = usageRecord5.getRecordId();
        org.junit.Assert.assertNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(operationalStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }
}

