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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        boolean boolean7 = equipment3.isReservable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        java.lang.Class<?> wildcardClass5 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "", "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.enums.OperationalStatus operationalStatus6 = equipment3.getOperationalStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!)" + "'", str5, "hi! - hi! (hi!)");
        org.junit.Assert.assertTrue("'" + operationalStatus6 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus6.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getEquipmentId();
        boolean boolean10 = equipment3.isReservable();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getEquipmentId();
        com.yorku.lab.model.UsageRecord usageRecord10 = null;
        equipment3.addUsageRecord(usageRecord10);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        boolean boolean9 = equipment3.isInUse();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        boolean boolean7 = equipment3.isInUse();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = equipment3.getUsageRecords();
        java.lang.Class<?> wildcardClass7 = equipment3.getClass();
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getEquipmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = equipment3.getUsageRecords();
        java.lang.String str7 = equipment3.getLabLocation();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.detach(sensorObserver8);
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "hi! - hi! (hi!)");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
        java.lang.String str7 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ()" + "'", str7, " - hi! ()");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList9 = equipment3.getUsageRecords();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(usageRecordList9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.detach(sensorObserver5);
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.attach(sensorObserver6);
        java.lang.Class<?> wildcardClass8 = equipment3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!)" + "'", str5, "hi! - hi! (hi!)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.setInUse(true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! ()" + "'", str9, " - hi! ()");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = equipment3.getUsageRecords();
        equipment3.setInUse(true);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.attach(sensorObserver9);
        org.junit.Assert.assertNotNull(usageRecordList6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.model.Equipment equipment9 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = equipment9.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord11 = null;
        equipment9.addUsageRecord(usageRecord11);
        java.lang.String str13 = equipment9.toString();
        com.yorku.lab.model.Equipment equipment17 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean18 = equipment17.isInUse();
        java.lang.String str19 = equipment17.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver20 = null;
        equipment17.attach(sensorObserver20);
        java.lang.String str22 = equipment17.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = equipment17.getOperationalStatus();
        equipment9.setOperationalStatus(operationalStatus23);
        equipment3.setOperationalStatus(operationalStatus23);
        java.lang.String str26 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - hi! ()" + "'", str13, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi! (hi!)" + "'", str19, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus23 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus23.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " - hi! ()" + "'", str26, " - hi! ()");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        java.lang.String str10 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        equipment3.notifyObservers();
        equipment3.notifyObservers();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getEquipmentId();
        java.lang.String str10 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        boolean boolean5 = equipment3.isReservable();
        boolean boolean6 = equipment3.isReservable();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        boolean boolean4 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        java.lang.Class<?> wildcardClass9 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        boolean boolean9 = equipment3.isReservable();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.attach(sensorObserver6);
        java.lang.String str8 = equipment3.getDescription();
        java.lang.String str9 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!)" + "'", str5, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        equipment3.setInUse(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        boolean boolean10 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", " - hi! ()", "hi! - hi! (hi!)");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "", "hi! - hi! (hi!)");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        boolean boolean6 = equipment3.isReservable();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.toString();
        java.lang.String str8 = equipment3.getLabLocation();
        com.yorku.lab.model.UsageRecord usageRecord9 = null;
        equipment3.addUsageRecord(usageRecord9);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ()" + "'", str7, " - hi! ()");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.toString();
        java.lang.String str8 = equipment3.getLabLocation();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver9 = null;
        equipment3.detach(sensorObserver9);
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ()" + "'", str7, " - hi! ()");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.detach(sensorObserver5);
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList7 = equipment3.getUsageRecords();
        java.lang.String str8 = equipment3.toString();
        org.junit.Assert.assertNotNull(usageRecordList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! ()" + "'", str8, " - hi! ()");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.model.Equipment equipment9 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver10 = null;
        equipment9.detach(sensorObserver10);
        com.yorku.lab.model.Equipment equipment15 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList16 = equipment15.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord17 = null;
        equipment15.addUsageRecord(usageRecord17);
        java.lang.String str19 = equipment15.toString();
        com.yorku.lab.model.Equipment equipment23 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean24 = equipment23.isInUse();
        java.lang.String str25 = equipment23.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver26 = null;
        equipment23.attach(sensorObserver26);
        java.lang.String str28 = equipment23.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus29 = equipment23.getOperationalStatus();
        equipment15.setOperationalStatus(operationalStatus29);
        equipment9.setOperationalStatus(operationalStatus29);
        equipment3.setOperationalStatus(operationalStatus29);
        java.lang.String str33 = equipment3.getEquipmentId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!)" + "'", str5, "hi! - hi! (hi!)");
        org.junit.Assert.assertNotNull(usageRecordList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " - hi! ()" + "'", str19, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi! (hi!)" + "'", str25, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus29 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus29.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getLabLocation();
        java.lang.String str8 = equipment3.getDescription();
        java.lang.Class<?> wildcardClass9 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        boolean boolean5 = equipment3.isInUse();
        boolean boolean6 = equipment3.isInUse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        java.lang.String str6 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        org.junit.Assert.assertNotNull(usageRecordList4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        java.lang.String str5 = equipment3.getDescription();
        java.lang.Class<?> wildcardClass6 = equipment3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi! - hi! (hi!)", "hi!", "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        equipment3.notifyObservers();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList6 = equipment3.getUsageRecords();
        equipment3.setInUse(true);
        java.lang.String str9 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(usageRecordList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        java.lang.String str4 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! - hi! (hi!)" + "'", str4, "hi! - hi! (hi!)");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        com.yorku.lab.enums.OperationalStatus operationalStatus9 = null;
        equipment3.setOperationalStatus(operationalStatus9);
        java.lang.String str11 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        java.lang.String str7 = equipment3.toString();
        com.yorku.lab.model.Equipment equipment11 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean12 = equipment11.isInUse();
        java.lang.String str13 = equipment11.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver14 = null;
        equipment11.attach(sensorObserver14);
        java.lang.String str16 = equipment11.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus17 = equipment11.getOperationalStatus();
        equipment3.setOperationalStatus(operationalStatus17);
        equipment3.notifyObservers();
        boolean boolean20 = equipment3.isReservable();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! ()" + "'", str7, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! (hi!)" + "'", str13, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus17 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus17.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi! - hi! (hi!)", "");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        java.lang.String str5 = equipment3.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.attach(sensorObserver6);
        java.lang.String str8 = equipment3.getDescription();
        java.lang.String str9 = equipment3.getDescription();
        com.yorku.lab.model.UsageRecord usageRecord10 = null;
        equipment3.addUsageRecord(usageRecord10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! (hi!)" + "'", str5, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        equipment3.setInUse(true);
        com.yorku.lab.model.Equipment equipment9 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean10 = equipment9.isInUse();
        java.lang.String str11 = equipment9.toString();
        com.yorku.lab.model.Equipment equipment15 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver16 = null;
        equipment15.detach(sensorObserver16);
        com.yorku.lab.model.Equipment equipment21 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList22 = equipment21.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord23 = null;
        equipment21.addUsageRecord(usageRecord23);
        java.lang.String str25 = equipment21.toString();
        com.yorku.lab.model.Equipment equipment29 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean30 = equipment29.isInUse();
        java.lang.String str31 = equipment29.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver32 = null;
        equipment29.attach(sensorObserver32);
        java.lang.String str34 = equipment29.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus35 = equipment29.getOperationalStatus();
        equipment21.setOperationalStatus(operationalStatus35);
        equipment15.setOperationalStatus(operationalStatus35);
        equipment9.setOperationalStatus(operationalStatus35);
        equipment3.setOperationalStatus(operationalStatus35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! (hi!)" + "'", str11, "hi! - hi! (hi!)");
        org.junit.Assert.assertNotNull(usageRecordList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " - hi! ()" + "'", str25, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! - hi! (hi!)" + "'", str31, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus35 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus35.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList4 = equipment3.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord5 = null;
        equipment3.addUsageRecord(usageRecord5);
        com.yorku.lab.enums.OperationalStatus operationalStatus7 = null;
        equipment3.setOperationalStatus(operationalStatus7);
        java.lang.String str9 = equipment3.getDescription();
        boolean boolean10 = equipment3.isInUse();
        java.lang.String str11 = equipment3.getEquipmentId();
        org.junit.Assert.assertNotNull(usageRecordList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.lang.String str4 = equipment3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean4 = equipment3.isInUse();
        boolean boolean5 = equipment3.isInUse();
        equipment3.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        equipment3.notifyObservers();
        java.lang.String str8 = equipment3.toString();
        com.yorku.lab.model.UsageRecord usageRecord9 = null;
        equipment3.addUsageRecord(usageRecord9);
        java.lang.String str11 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! ()" + "'", str8, " - hi! ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - hi! ()" + "'", str11, " - hi! ()");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver6 = null;
        equipment3.detach(sensorObserver6);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver8 = null;
        equipment3.attach(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            equipment3.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.observer.SensorObserver.update(com.yorku.lab.model.Equipment)\" because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord4 = null;
        equipment3.addUsageRecord(usageRecord4);
        java.lang.String str6 = equipment3.getDescription();
        equipment3.notifyObservers();
        java.lang.String str8 = equipment3.toString();
        java.lang.String str9 = equipment3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - hi! ()" + "'", str8, " - hi! ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - hi! ()" + "'", str9, " - hi! ()");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", " - hi! ()", " - hi! ()");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        equipment3.notifyObservers();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver5 = null;
        equipment3.attach(sensorObserver5);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        java.lang.String str6 = equipment3.getEquipmentId();
        java.lang.String str7 = equipment3.getDescription();
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList8 = equipment3.getUsageRecords();
        com.yorku.lab.model.Equipment equipment12 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver13 = null;
        equipment12.detach(sensorObserver13);
        com.yorku.lab.model.Equipment equipment18 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList19 = equipment18.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord20 = null;
        equipment18.addUsageRecord(usageRecord20);
        java.lang.String str22 = equipment18.toString();
        com.yorku.lab.model.Equipment equipment26 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean27 = equipment26.isInUse();
        java.lang.String str28 = equipment26.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver29 = null;
        equipment26.attach(sensorObserver29);
        java.lang.String str31 = equipment26.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus32 = equipment26.getOperationalStatus();
        equipment18.setOperationalStatus(operationalStatus32);
        equipment12.setOperationalStatus(operationalStatus32);
        equipment3.setOperationalStatus(operationalStatus32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(usageRecordList8);
        org.junit.Assert.assertNotNull(usageRecordList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - hi! ()" + "'", str22, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! - hi! (hi!)" + "'", str28, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus32 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus32.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        com.yorku.lab.model.Equipment equipment9 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList10 = equipment9.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord11 = null;
        equipment9.addUsageRecord(usageRecord11);
        java.lang.String str13 = equipment9.toString();
        com.yorku.lab.model.Equipment equipment17 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean18 = equipment17.isInUse();
        java.lang.String str19 = equipment17.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver20 = null;
        equipment17.attach(sensorObserver20);
        java.lang.String str22 = equipment17.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus23 = equipment17.getOperationalStatus();
        equipment9.setOperationalStatus(operationalStatus23);
        equipment3.setOperationalStatus(operationalStatus23);
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver26 = null;
        equipment3.detach(sensorObserver26);
        org.junit.Assert.assertNotNull(usageRecordList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - hi! ()" + "'", str13, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi! (hi!)" + "'", str19, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus23 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus23.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver4 = null;
        equipment3.detach(sensorObserver4);
        java.lang.String str6 = equipment3.getEquipmentId();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver7 = null;
        equipment3.detach(sensorObserver7);
        com.yorku.lab.model.Equipment equipment12 = new com.yorku.lab.model.Equipment("", "hi!", "");
        com.yorku.lab.model.UsageRecord usageRecord13 = null;
        equipment12.addUsageRecord(usageRecord13);
        java.lang.String str15 = equipment12.getDescription();
        equipment12.notifyObservers();
        com.yorku.lab.model.Equipment equipment20 = new com.yorku.lab.model.Equipment("", "hi!", "");
        java.util.List<com.yorku.lab.model.UsageRecord> usageRecordList21 = equipment20.getUsageRecords();
        com.yorku.lab.model.UsageRecord usageRecord22 = null;
        equipment20.addUsageRecord(usageRecord22);
        java.lang.String str24 = equipment20.toString();
        com.yorku.lab.model.Equipment equipment28 = new com.yorku.lab.model.Equipment("hi!", "hi!", "hi!");
        boolean boolean29 = equipment28.isInUse();
        java.lang.String str30 = equipment28.toString();
        com.yorku.lab.pattern.observer.SensorObserver sensorObserver31 = null;
        equipment28.attach(sensorObserver31);
        java.lang.String str33 = equipment28.getDescription();
        com.yorku.lab.enums.OperationalStatus operationalStatus34 = equipment28.getOperationalStatus();
        equipment20.setOperationalStatus(operationalStatus34);
        equipment12.setOperationalStatus(operationalStatus34);
        equipment3.setOperationalStatus(operationalStatus34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(usageRecordList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " - hi! ()" + "'", str24, " - hi! ()");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi! - hi! (hi!)" + "'", str30, "hi! - hi! (hi!)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + operationalStatus34 + "' != '" + com.yorku.lab.enums.OperationalStatus.AVAILABLE + "'", operationalStatus34.equals(com.yorku.lab.enums.OperationalStatus.AVAILABLE));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.model.Equipment equipment3 = new com.yorku.lab.model.Equipment(" - hi! ()", "", "");
    }
}

