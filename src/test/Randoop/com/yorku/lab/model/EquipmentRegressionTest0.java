package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentRegressionTest0 {

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
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        java.lang.Class<?> wildcardClass7 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        java.lang.Class<?> wildcardClass5 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        java.lang.Class<?> wildcardClass10 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.Class<?> wildcardClass5 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        java.lang.Class<?> wildcardClass6 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        java.lang.Class<?> wildcardClass7 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        equipment3.setInUse(true);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.detach(sensorObserver8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        equipment3.setInUse(true);
        java.lang.Class<?> wildcardClass8 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        boolean boolean7 = equipment3.isReservable();
        java.lang.String str8 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = equipment3.getUsageRecords();
        java.lang.String str9 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        equipment3.notifyObservers();
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = equipment3.getUsageRecords();
        java.lang.Class<?> wildcardClass9 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        java.lang.String str9 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! ()" + "'", str9, " - hi! ()");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = equipment3.getOperationalStatus();
        java.lang.Class<?> wildcardClass9 = operationalStatus8.getClass();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus8 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus8.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " - hi! ()");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.toString();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.detach(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.toString();
        boolean boolean5 = equipment3.isInUse();
        equipment3.setInUse(false);
        java.lang.Class<?> wildcardClass8 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.getLabLocation();
        equipment3.notifyObservers();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        equipment3.notifyObservers();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        boolean boolean5 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        java.lang.String str4 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.lang.String str6 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.notifyObservers();
        com.yorku.lab.model.UsageRecord usageRecord7 = null;
        equipment3.addUsageRecord(usageRecord7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.attach(sensorObserver6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        java.lang.String str7 = equipment3.getEquipmentId();
        com.yorku.lab.model.UsageRecord usageRecord8 = null;
        equipment3.addUsageRecord(usageRecord8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.detach(sensorObserver5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.attach(sensorObserver4);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.observer.SensorObserver.update(com.yorku.lab.model.Equipment)\" because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  ( -  (hi!))", "hi!", " - hi! ()");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        java.lang.String str6 = equipment3.getLabLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        boolean boolean7 = equipment3.isReservable();
        java.lang.String str8 = equipment3.getDescription();
        com.yorku.lab.model.Equipment equipment12 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean13 = equipment12.isInUse();
        java.lang.String str14 = equipment12.toString();
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = equipment12.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi!)" + "'", str14, " -  (hi!)");
        org.junit.Assert.assertTrue("'" + operationalStatus15 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus15.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        equipment3.setInUse(false);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  ( -  (hi!))", "", " -  ( -  (hi!))");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        boolean boolean7 = equipment3.isReservable();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        boolean boolean6 = equipment3.isReservable();
        java.lang.String str7 = equipment3.toString();
        java.lang.Class<?> wildcardClass8 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ()" + "'", str7, " - hi! ()");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = equipment3.getOperationalStatus();
        com.yorku.lab.model.UsageRecord usageRecord9 = null;
        equipment3.addUsageRecord(usageRecord9);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus8 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus8.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        boolean boolean9 = equipment3.isInUse();
        java.lang.String str10 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        equipment3.setOperationalStatus(operationalStatus6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.getLabLocation();
        boolean boolean8 = equipment3.isReservable();
        java.lang.String str9 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! ()" + "'", str9, " - hi! ()");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        boolean boolean4 = equipment3.isReservable();
        equipment3.setInUse(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.notifyObservers();
        boolean boolean7 = equipment3.isReservable();
        java.lang.String str8 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi!)" + "'", str8, " -  (hi!)");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        java.lang.String str7 = equipment3.getEquipmentId();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        java.lang.String str10 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        equipment3.setOperationalStatus(operationalStatus5);
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.getLabLocation();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.detach(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi!)" + "'", str8, " -  (hi!)");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = equipment3.getOperationalStatus();
        java.lang.String str7 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!)" + "'", str5, " -  (hi!)");
        org.junit.Assert.assertTrue("'" + operationalStatus6 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus6.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", " -  (hi!)");
        java.lang.String str4 = equipment3.toString();
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = equipment3.getOperationalStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " -  ( -  (hi!))" + "'", str4, " -  ( -  (hi!))");
        org.junit.Assert.assertTrue("'" + operationalStatus5 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus5.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", " - hi! ()");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        java.lang.String str7 = equipment3.getEquipmentId();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.observer.SensorObserver.update(com.yorku.lab.model.Equipment)\" because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.attach(sensorObserver4);
        equipment3.setInUse(true);
        java.lang.Class<?> wildcardClass8 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi! -  ()", " -  (hi!)", "hi! -  ()");
        com.yorku.lab.model.Equipment equipment7 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment7.setInUse(true);
        equipment7.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = equipment7.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus11);
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = null;
        equipment3.setOperationalStatus(operationalStatus13);
        org.junit.Assert.assertTrue("'" + operationalStatus11 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus11.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        equipment3.notifyObservers();
        java.lang.String str7 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = equipment3.getOperationalStatus();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus8 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus8.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  (hi!)", "", "");
        java.lang.Class<?> wildcardClass4 = equipment3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = equipment3.getUsageRecords();
        equipment3.notifyObservers();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = equipment3.getUsageRecords();
        java.lang.String str9 = equipment3.getDescription();
        java.lang.String str10 = equipment3.getLabLocation();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver10 = null;
        equipment3.detach(sensorObserver10);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = equipment3.getOperationalStatus();
        boolean boolean9 = equipment3.isInUse();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus8 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus8.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        boolean boolean5 = equipment3.isReservable();
        boolean boolean6 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = equipment3.getOperationalStatus();
        equipment3.setInUse(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!)" + "'", str5, " -  (hi!)");
        org.junit.Assert.assertTrue("'" + operationalStatus6 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus6.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" - hi! ( -  (hi!))", "hi! -  ()", " - hi! ()");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.attach(sensorObserver4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ()" + "'", str7, " - hi! ()");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = equipment3.getOperationalStatus();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + operationalStatus7 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus7.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.getLabLocation();
        boolean boolean5 = equipment3.isReservable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", " -  ( -  (hi!))");
        java.lang.String str4 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        com.yorku.lab.model.Equipment equipment8 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment8.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord10 = null;
        equipment8.addUsageRecord(usageRecord10);
        boolean boolean12 = equipment8.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = equipment8.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus13);
        com.yorku.lab.model.UsageRecord usageRecord15 = null;
        equipment3.addUsageRecord(usageRecord15);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus13 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus13.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.getLabLocation();
        java.lang.String str5 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  ()" + "'", str5, "hi! -  ()");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  (hi!)", "", "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        java.lang.String str6 = equipment3.getEquipmentId();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.attach(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        equipment3.notifyObservers();
        java.lang.String str7 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! (hi!)" + "'", str7, " - hi! (hi!)");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        boolean boolean4 = equipment3.isReservable();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        java.lang.String str7 = equipment3.toString();
        boolean boolean8 = equipment3.isReservable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " -  ( -  (hi!))" + "'", str7, " -  ( -  (hi!))");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        boolean boolean9 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        equipment3.setOperationalStatus(operationalStatus10);
        java.lang.String str12 = equipment3.getEquipmentId();
        java.lang.String str13 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.notifyObservers();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        boolean boolean9 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi! -  ()", "");
        equipment3.notifyObservers();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        equipment3.setOperationalStatus(operationalStatus5);
        java.lang.String str7 = equipment3.getDescription();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord9 = null;
        equipment3.addUsageRecord(usageRecord9);
        equipment3.notifyObservers();
        boolean boolean12 = equipment3.isReservable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.getDescription();
        com.yorku.lab.model.UsageRecord usageRecord6 = null;
        equipment3.addUsageRecord(usageRecord6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        boolean boolean9 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = null;
        equipment3.setOperationalStatus(operationalStatus10);
        java.lang.String str12 = equipment3.getEquipmentId();
        java.lang.String str13 = equipment3.getLabLocation();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        boolean boolean4 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        boolean boolean8 = equipment3.isInUse();
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.detach(sensorObserver8);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" - hi! ( -  (hi!))", "", "");
        com.yorku.lab.enums.OperationalStatus operationalStatus4 = equipment3.getOperationalStatus();
        org.junit.Assert.assertTrue("'" + operationalStatus4 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus4.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        boolean boolean6 = equipment3.isInUse();
        boolean boolean7 = equipment3.isReservable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver10 = null;
        equipment3.attach(sensorObserver10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        equipment3.setOperationalStatus(operationalStatus5);
        java.lang.String str7 = equipment3.toString();
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ( -  (hi!))" + "'", str7, " - hi! ( -  (hi!))");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        equipment3.setInUse(true);
        equipment3.notifyObservers();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  (hi!)", " - hi! ()", "hi!");
        equipment3.setInUse(false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.getLabLocation();
        boolean boolean8 = equipment3.isReservable();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        java.lang.String str11 = equipment3.getLabLocation();
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = equipment3.getOperationalStatus();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + operationalStatus12 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus12.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.detach(sensorObserver8);
        java.lang.String str10 = equipment3.getDescription();
        java.lang.String str11 = equipment3.getLabLocation();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver12 = null;
        equipment3.attach(sensorObserver12);
        com.yorku.lab.model.UsageRecord usageRecord14 = null;
        equipment3.addUsageRecord(usageRecord14);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi! -  ()", "");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = null;
        equipment3.setOperationalStatus(operationalStatus6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.observer.SensorObserver.update(com.yorku.lab.model.Equipment)\" because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        boolean boolean9 = equipment3.isReservable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.getLabLocation();
        boolean boolean8 = equipment3.isReservable();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = equipment3.getOperationalStatus();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + operationalStatus9 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus9.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        java.lang.String str9 = equipment3.getEquipmentId();
        java.lang.String str10 = equipment3.getDescription();
        java.lang.String str11 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        equipment3.setInUse(true);
        java.lang.String str12 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.notifyObservers();
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.getLabLocation();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.detach(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi!)" + "'", str8, " -  (hi!)");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        boolean boolean4 = equipment3.isReservable();
        com.yorku.lab.model.Equipment equipment8 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment8.setInUse(true);
        equipment8.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus12 = equipment8.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + operationalStatus12 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus12.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        java.lang.String str9 = equipment3.getEquipmentId();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = equipment3.getOperationalStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + operationalStatus10 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus10.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        java.lang.String str8 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        java.lang.String str4 = equipment3.getDescription();
        equipment3.setInUse(false);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        com.yorku.lab.model.Equipment equipment8 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment8.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord10 = null;
        equipment8.addUsageRecord(usageRecord10);
        boolean boolean12 = equipment8.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus13 = equipment8.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus13);
        java.lang.Class<?> wildcardClass15 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus13 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus13.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        boolean boolean8 = equipment3.isInUse();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        java.lang.String str11 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", " -  (hi!)");
        boolean boolean4 = equipment3.isReservable();
        java.lang.String str5 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!)" + "'", str5, " -  (hi!)");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        equipment3.setInUse(true);
        boolean boolean12 = equipment3.isInUse();
        java.lang.String str13 = equipment3.getDescription();
        boolean boolean14 = equipment3.isInUse();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        boolean boolean6 = equipment3.isInUse();
        equipment3.setInUse(false);
        com.yorku.lab.model.Equipment equipment12 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList13 = equipment12.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord14 = null;
        equipment12.addUsageRecord(usageRecord14);
        com.yorku.lab.enums.OperationalStatus operationalStatus16 = equipment12.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(usageRecordList13);
        org.junit.Assert.assertTrue("'" + operationalStatus16 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus16.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.getDescription();
        java.lang.String str6 = equipment3.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        boolean boolean5 = equipment3.isReservable();
        com.yorku.lab.model.UsageRecord usageRecord6 = null;
        equipment3.addUsageRecord(usageRecord6);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.detach(sensorObserver8);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        boolean boolean5 = equipment3.isReservable();
        com.yorku.lab.model.UsageRecord usageRecord6 = null;
        equipment3.addUsageRecord(usageRecord6);
        java.lang.String str8 = equipment3.toString();
        java.lang.String str9 = equipment3.getLabLocation();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! ()" + "'", str8, " - hi! ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        boolean boolean7 = equipment3.isReservable();
        java.lang.String str8 = equipment3.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.detach(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! ()" + "'", str8, " - hi! ()");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi! -  ()", " -  (hi!)", "hi! -  ()");
        com.yorku.lab.model.Equipment equipment7 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment7.setInUse(true);
        equipment7.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus11 = equipment7.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus11);
        boolean boolean13 = equipment3.isReservable();
        com.yorku.lab.model.UsageRecord usageRecord14 = null;
        equipment3.addUsageRecord(usageRecord14);
        org.junit.Assert.assertTrue("'" + operationalStatus11 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus11.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi! -  ()", "");
        java.lang.String str4 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        boolean boolean8 = equipment3.isInUse();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = equipment3.getUsageRecords();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = equipment3.getOperationalStatus();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.detach(sensorObserver8);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + operationalStatus7 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus7.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" - hi! (hi!)", " - hi! ()", " - hi! ( -  (hi!))");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" - hi! ( -  (hi!))", " - hi! ( -  (hi!))", " - hi! ( -  (hi!))");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = equipment3.getOperationalStatus();
        java.lang.String str9 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus8 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus8.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.toString();
        boolean boolean5 = equipment3.isInUse();
        java.lang.String str6 = equipment3.getLabLocation();
        equipment3.notifyObservers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  (hi!)", " - hi! ()", "hi!");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        com.yorku.lab.model.Equipment equipment13 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment13.notifyObservers();
        com.yorku.lab.model.Equipment equipment18 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = equipment18.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord20 = null;
        equipment18.addUsageRecord(usageRecord20);
        boolean boolean22 = equipment18.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = equipment18.getOperationalStatus();
        equipment13.setOperationalStatus(operationalStatus23);
        equipment3.setOperationalStatus(operationalStatus23);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver26 = null;
        equipment3.detach(sensorObserver26);
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList29 = equipment3.getUsageRecords();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus23 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus23.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(usageRecordList29);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.getLabLocation();
        boolean boolean8 = equipment3.isReservable();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        boolean boolean10 = equipment3.isInUse();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        java.lang.String str9 = equipment3.getEquipmentId();
        com.yorku.lab.model.UsageRecord usageRecord10 = null;
        equipment3.addUsageRecord(usageRecord10);
        boolean boolean12 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", " - hi! (hi!)", "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.getLabLocation();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        com.yorku.lab.model.Equipment equipment10 = new com.yorku.lab.model.Equipment("hi! -  ()", " -  (hi!)", "hi! -  ()");
        com.yorku.lab.model.Equipment equipment14 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment14.setInUse(true);
        equipment14.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus18 = equipment14.getOperationalStatus();
        equipment10.setOperationalStatus(operationalStatus18);
        equipment3.setOperationalStatus(operationalStatus18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + operationalStatus18 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus18.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.getLabLocation();
        boolean boolean8 = equipment3.isReservable();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        java.lang.Class<?> wildcardClass10 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.notifyObservers();
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.getLabLocation();
        boolean boolean9 = equipment3.isInUse();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " -  (hi!)" + "'", str8, " -  (hi!)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.Class<?> wildcardClass7 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        boolean boolean8 = equipment3.isInUse();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver11 = null;
        equipment3.attach(sensorObserver11);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver13 = null;
        equipment3.attach(sensorObserver13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        boolean boolean8 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = equipment3.getOperationalStatus();
        boolean boolean10 = equipment3.isReservable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus9 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus9.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = equipment3.getOperationalStatus();
        java.lang.Class<?> wildcardClass6 = operationalStatus5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus5 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus5.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", " -  (hi!)");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = equipment3.getOperationalStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + operationalStatus7 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus7.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = equipment3.getOperationalStatus();
        org.junit.Assert.assertTrue("'" + operationalStatus7 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus7.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getLabLocation();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.detach(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", " -  (hi!)");
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus5 = null;
        equipment3.setOperationalStatus(operationalStatus5);
        java.lang.String str7 = equipment3.getDescription();
        java.lang.String str8 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! ( -  (hi!))" + "'", str8, " - hi! ( -  (hi!))");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.toString();
        boolean boolean5 = equipment3.isInUse();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = equipment3.getUsageRecords();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(usageRecordList7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" -  ( -  (hi!))", "hi! -  ()", " -  (hi!)");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        java.lang.Class<?> wildcardClass5 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        java.lang.String str8 = equipment3.getEquipmentId();
        com.yorku.lab.model.UsageRecord usageRecord9 = null;
        equipment3.addUsageRecord(usageRecord9);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi!");
        equipment3.setInUse(true);
        equipment3.notifyObservers();
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = equipment3.getOperationalStatus();
        java.lang.String str8 = equipment3.toString();
        org.junit.Assert.assertTrue("'" + operationalStatus7 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus7.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! (hi!)" + "'", str8, " - hi! (hi!)");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " -  (hi!)" + "'", str5, " -  (hi!)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        equipment3.notifyObservers();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus8 = equipment3.getOperationalStatus();
        com.yorku.lab.model.Equipment equipment12 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean13 = equipment12.isInUse();
        java.lang.String str14 = equipment12.toString();
        com.yorku.lab.enums.OperationalStatus operationalStatus15 = equipment12.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus15);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus8 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus8.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  (hi!)" + "'", str14, " -  (hi!)");
        org.junit.Assert.assertTrue("'" + operationalStatus15 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus15.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi!");
        boolean boolean4 = equipment3.isInUse();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.detach(sensorObserver5);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.attach(sensorObserver7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        boolean boolean5 = equipment3.isInUse();
        equipment3.notifyObservers();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        boolean boolean7 = equipment3.isReservable();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        com.yorku.lab.model.Equipment equipment13 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment13.notifyObservers();
        com.yorku.lab.model.Equipment equipment18 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = equipment18.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord20 = null;
        equipment18.addUsageRecord(usageRecord20);
        boolean boolean22 = equipment18.isInUse();
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = equipment18.getOperationalStatus();
        equipment13.setOperationalStatus(operationalStatus23);
        equipment3.setOperationalStatus(operationalStatus23);
        com.yorku.lab.enums.OperationalStatus operationalStatus26 = equipment3.getOperationalStatus();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver27 = null;
        equipment3.attach(sensorObserver27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertNotNull(usageRecordList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + operationalStatus23 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus23.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + operationalStatus26 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus26.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        equipment3.setInUse(true);
        boolean boolean12 = equipment3.isInUse();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver13 = null;
        equipment3.attach(sensorObserver13);
        java.lang.String str15 = equipment3.getLabLocation();
        com.yorku.lab.model.UsageRecord usageRecord16 = null;
        equipment3.addUsageRecord(usageRecord16);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList18 = equipment3.getUsageRecords();
        com.yorku.lab.enums.OperationalStatus operationalStatus19 = equipment3.getOperationalStatus();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(usageRecordList18);
        org.junit.Assert.assertNull(operationalStatus19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = equipment3.getUsageRecords();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        com.yorku.lab.enums.OperationalStatus operationalStatus10 = equipment3.getOperationalStatus();
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList9);
        org.junit.Assert.assertTrue("'" + operationalStatus10 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus10.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "");
        java.lang.String str4 = equipment3.toString();
        boolean boolean5 = equipment3.isInUse();
        equipment3.notifyObservers();
        equipment3.setInUse(true);
        equipment3.notifyObservers();
        java.lang.String str10 = equipment3.getDescription();
        equipment3.notifyObservers();
        equipment3.setInUse(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! -  ()" + "'", str4, "hi! -  ()");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

