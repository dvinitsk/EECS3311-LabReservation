package com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsageMonitoringServiceRegressionTest0 {

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
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment8, false, operationalStatus10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass3 = usageRecordList2.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment5, false, operationalStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment9, false, operationalStatus11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass5 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.lang.Class<?> wildcardClass8 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment10, false, operationalStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment3, false, operationalStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.lang.Class<?> wildcardClass4 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment10, true, operationalStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment4, false, operationalStatus6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass7 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass11 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment8, true, operationalStatus10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment13, false, operationalStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment9, false, operationalStatus11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment13, true, operationalStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment1, false, operationalStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass5 = usageRecordList4.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment11, true, operationalStatus13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus16 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment14, false, operationalStatus16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment11, false, operationalStatus13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment11, false, operationalStatus13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        java.lang.Class<?> wildcardClass14 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment9, true, operationalStatus11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment4, true, operationalStatus6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass9 = usageRecordList8.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment17, true, operationalStatus19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass12 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment12, operationalStatus13);
        java.lang.Class<?> wildcardClass15 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass7 = usageRecordList6.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass10 = usageRecordList9.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        java.lang.Class<?> wildcardClass9 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment12, false, operationalStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass7 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment1, true, operationalStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment10, false, operationalStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass11 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment12, true, operationalStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass11 = usageRecordList10.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass9 = usageRecordList8.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus22 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment20, false, operationalStatus22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.lang.Class<?> wildcardClass10 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass9 = usageRecordList8.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass11 = usageRecordList10.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus22 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment20, true, operationalStatus22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass14 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment3, false, operationalStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass12 = usageRecordList11.getClass();
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass11 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment11, true, operationalStatus13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass14 = usageRecordList13.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment10, false, operationalStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment9, true, operationalStatus11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment5, true, operationalStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment16, false, operationalStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment7, false, operationalStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass13 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass12 = usageRecordList11.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment12, false, operationalStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.lang.Class<?> wildcardClass16 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass11 = usageRecordList10.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment12, false, operationalStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment7, false, operationalStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass18 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass18 = usageRecordList17.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass14 = usageRecordList13.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment18 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment18, false, operationalStatus20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment11, false, operationalStatus13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment10, false, operationalStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment16, false, operationalStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment16, true, operationalStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment12, operationalStatus13);
        java.lang.Class<?> wildcardClass15 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass13 = usageRecordList12.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass13 = usageRecordList12.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass16 = usageRecordList15.getClass();
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment16, operationalStatus17);
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment19, operationalStatus20);
        java.lang.Class<?> wildcardClass22 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass18 = usageRecordList17.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment12, false, operationalStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment9, false, operationalStatus11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment18 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment18, operationalStatus19);
        com.yorku.lab.model.Equipment equipment21 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment21, false, operationalStatus23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment13, false, operationalStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment17, false, operationalStatus19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment12, operationalStatus13);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass17 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass25 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus16 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment14, false, operationalStatus16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus16 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment14, false, operationalStatus16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment12, false, operationalStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.lang.Class<?> wildcardClass12 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass5 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass11 = usageRecordList10.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment16, operationalStatus17);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass16 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment13, false, operationalStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment19, false, operationalStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList21 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(usageRecordList19);
        org.junit.Assert.assertNotNull(usageRecordList21);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.lang.Class<?> wildcardClass16 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass3 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass10 = usageRecordList9.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment8, true, operationalStatus10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass9 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment17, false, operationalStatus19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment18 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment18, operationalStatus19);
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass15 = usageRecordList14.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment6, false, operationalStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass11 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList21 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(usageRecordList19);
        org.junit.Assert.assertNotNull(usageRecordList21);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment6, operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass14 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass14 = usageRecordList13.getClass();
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass13 = usageRecordList12.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        com.yorku.lab.model.Equipment equipment23 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus25 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment23, false, operationalStatus25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment17, false, operationalStatus19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
        org.junit.Assert.assertNotNull(usageRecordList16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment16, false, operationalStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.lang.Class<?> wildcardClass7 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment19, operationalStatus20);
        com.yorku.lab.model.Equipment equipment22 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment22, false, operationalStatus24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        com.yorku.lab.model.Equipment equipment23 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus24 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment23, operationalStatus24);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(usageRecordList19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus22 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment20, true, operationalStatus22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(usageRecordList19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass14 = usageRecordList13.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment19, false, operationalStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
        org.junit.Assert.assertNotNull(usageRecordList16);
        org.junit.Assert.assertNotNull(usageRecordList18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList20 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList22 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass23 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
        org.junit.Assert.assertNotNull(usageRecordList20);
        org.junit.Assert.assertNotNull(usageRecordList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment8, false, operationalStatus10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment5, false, operationalStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList21 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment22 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment22, false, operationalStatus24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList21);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment16, true, operationalStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment19, operationalStatus20);
        com.yorku.lab.model.Equipment equipment22 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment22, operationalStatus23);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass11 = usageRecordList10.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList26 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList28 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment29 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus30 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment29, operationalStatus30);
        com.yorku.lab.model.Equipment equipment32 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus34 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment32, false, operationalStatus34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(usageRecordList26);
        org.junit.Assert.assertNotNull(usageRecordList28);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment7, true, operationalStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment16, operationalStatus17);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList26 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList28 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass29 = usageRecordList28.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(usageRecordList26);
        org.junit.Assert.assertNotNull(usageRecordList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList26 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList28 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList30 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(usageRecordList26);
        org.junit.Assert.assertNotNull(usageRecordList28);
        org.junit.Assert.assertNotNull(usageRecordList30);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass9 = usageRecordList8.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList26 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList28 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass29 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(usageRecordList26);
        org.junit.Assert.assertNotNull(usageRecordList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
        org.junit.Assert.assertNotNull(usageRecordList16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment17, false, operationalStatus19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment18 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment18, true, operationalStatus20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment19, operationalStatus20);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
        org.junit.Assert.assertNotNull(usageRecordList16);
        org.junit.Assert.assertNotNull(usageRecordList18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment19, true, operationalStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass18 = usageRecordList17.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass18 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList20 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList18);
        org.junit.Assert.assertNotNull(usageRecordList20);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment12 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment12, operationalStatus13);
        com.yorku.lab.model.Equipment equipment15 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus16 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment15, operationalStatus16);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass3 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass17 = usageRecordList16.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
        org.junit.Assert.assertNotNull(usageRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList26 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList28 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(usageRecordList26);
        org.junit.Assert.assertNotNull(usageRecordList28);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment6, true, operationalStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment11, false, operationalStatus13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(usageRecordList19);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList26 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass27 = usageRecordList26.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList24);
        org.junit.Assert.assertNotNull(usageRecordList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment16, operationalStatus17);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList20 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment21 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment21, false, operationalStatus23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment16, operationalStatus17);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList20 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList22 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass23 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList20);
        org.junit.Assert.assertNotNull(usageRecordList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList20 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList22 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment23 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus24 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment23, operationalStatus24);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList27 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
        org.junit.Assert.assertNotNull(usageRecordList20);
        org.junit.Assert.assertNotNull(usageRecordList22);
        org.junit.Assert.assertNotNull(usageRecordList27);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus16 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment14, true, operationalStatus16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment7, false, operationalStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        com.yorku.lab.model.Equipment equipment4 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment4, operationalStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment7, operationalStatus8);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList15 = usageMonitoringService0.getUsageHistory("hi!");
        java.lang.Class<?> wildcardClass16 = usageRecordList15.getClass();
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(usageRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment9 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment9, operationalStatus10);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass14 = usageRecordList13.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment15 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment15, false, operationalStatus17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment10 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment10, operationalStatus11);
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList17 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment20 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus21 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment20, operationalStatus21);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList24 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment25 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus27 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment25, false, operationalStatus27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList17);
        org.junit.Assert.assertNotNull(usageRecordList19);
        org.junit.Assert.assertNotNull(usageRecordList24);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass13 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment3 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment3, operationalStatus4);
        com.yorku.lab.model.Equipment equipment6 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment6, false, operationalStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("");
        java.lang.Class<?> wildcardClass3 = usageRecordList2.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment17, operationalStatus18);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList21 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList23 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList25 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment26 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus28 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment26, false, operationalStatus28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList21);
        org.junit.Assert.assertNotNull(usageRecordList23);
        org.junit.Assert.assertNotNull(usageRecordList25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("hi!");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        com.yorku.lab.model.Equipment equipment1 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus2 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment1, operationalStatus2);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList5 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment13, true, operationalStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList5);
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        com.yorku.lab.model.Equipment equipment8 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment8, operationalStatus9);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment13 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus14 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment13, operationalStatus14);
        com.yorku.lab.model.Equipment equipment16 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment16, operationalStatus17);
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment5 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment5, operationalStatus6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList11 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        com.yorku.lab.model.Equipment equipment17 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment17, true, operationalStatus19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList11);
        org.junit.Assert.assertNotNull(usageRecordList13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment19 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus20 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment19, operationalStatus20);
        java.lang.Class<?> wildcardClass22 = usageMonitoringService0.getClass();
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment11, operationalStatus12);
        com.yorku.lab.model.Equipment equipment14 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment14, operationalStatus15);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList20 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList22 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment23 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus24 = null;
        usageMonitoringService0.notifyCoordinatorIfNeeded(equipment23, operationalStatus24);
        com.yorku.lab.model.Equipment equipment26 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus28 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment26, true, operationalStatus28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList18);
        org.junit.Assert.assertNotNull(usageRecordList20);
        org.junit.Assert.assertNotNull(usageRecordList22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.yorku.lab.service.UsageMonitoringService usageMonitoringService0 = new com.yorku.lab.service.UsageMonitoringService();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList2 = usageMonitoringService0.getUsageHistory("hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList12 = usageMonitoringService0.getUsageHistory("");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList14 = usageMonitoringService0.getUsageHistory("");
        com.yorku.lab.model.Equipment equipment15 = null;
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageMonitoringService0.recordUsageUpdate(equipment15, false, operationalStatus17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList2);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertNotNull(usageRecordList12);
        org.junit.Assert.assertNotNull(usageRecordList14);
    }
}

