package test.Randoop.com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentManagementServiceRegressionTest0 {

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
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.lang.Class<?> wildcardClass1 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        java.lang.Class<?> wildcardClass3 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.lang.Class<?> wildcardClass7 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.lang.Class<?> wildcardClass13 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.lang.Class<?> wildcardClass15 = equipmentOptional14.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.lang.Class<?> wildcardClass9 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.lang.Class<?> wildcardClass14 = equipment13.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.lang.Class<?> wildcardClass17 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.lang.Class<?> wildcardClass15 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.lang.Class<?> wildcardClass7 = equipment6.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.lang.Class<?> wildcardClass10 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.markMaintenance("");
        java.lang.Class<?> wildcardClass19 = equipmentOptional18.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass5 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.lang.Class<?> wildcardClass12 = equipmentOptional11.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("", "", "");
        java.lang.Class<?> wildcardClass24 = equipment23.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.enableEquipment("hi!");
        java.lang.Class<?> wildcardClass12 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass16 = equipmentOptional15.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.lang.Class<?> wildcardClass24 = equipment23.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.lang.Class<?> wildcardClass13 = equipment12.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.lang.Class<?> wildcardClass13 = equipment12.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment8 = equipmentManagementService0.addEquipment("", "", "");
        java.lang.Class<?> wildcardClass9 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipment8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment15 = equipmentManagementService0.addEquipment("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = equipment15.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipment15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass19 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.markMaintenance("");
        java.lang.Class<?> wildcardClass19 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass3 = equipmentOptional2.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass7 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.disableEquipment("");
        java.lang.Class<?> wildcardClass11 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional3 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional5 = equipmentManagementService0.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentOptional3);
        org.junit.Assert.assertNotNull(equipmentOptional5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional27 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional29 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentOptional27);
        org.junit.Assert.assertNotNull(equipmentOptional29);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional27 = equipmentManagementService0.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentOptional27);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.lang.Class<?> wildcardClass2 = equipmentList1.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional3 = equipmentManagementService0.markMaintenance("hi!");
        java.lang.Class<?> wildcardClass4 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentOptional3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.lang.Class<?> wildcardClass20 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment26 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment30 = equipmentManagementService0.addEquipment("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipment26);
        org.junit.Assert.assertNotNull(equipment30);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment21 = equipmentManagementService0.addEquipment("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass22 = equipment21.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipment21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentManagementService0.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass5 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional3 = equipmentManagementService0.markMaintenance("hi!");
        com.yorku.lab.model.Equipment equipment7 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentOptional3);
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.getEquipment("hi!");
        java.lang.Class<?> wildcardClass12 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "hi!", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment21 = equipmentManagementService0.addEquipment("hi!", "hi!", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipment21);
        org.junit.Assert.assertNotNull(equipmentOptional23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.disableEquipment("");
        java.lang.Class<?> wildcardClass19 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.lang.Class<?> wildcardClass21 = equipment20.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.markMaintenance("hi!");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.lang.Class<?> wildcardClass9 = equipmentOptional8.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "hi!", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        com.yorku.lab.model.Equipment equipment17 = equipmentManagementService0.addEquipment("", "", "hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipment17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment21 = equipmentManagementService0.addEquipment("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass22 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipment21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment25 = equipmentManagementService0.addEquipment("", "", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipment25);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass11 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentList21);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment18 = equipmentManagementService0.addEquipment("", "hi!", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipment18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional3 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional5 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentOptional3);
        org.junit.Assert.assertNotNull(equipmentOptional5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment15 = equipmentManagementService0.addEquipment("", "hi!", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment21 = equipmentManagementService0.addEquipment("hi!", "", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipment15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipment21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.markMaintenance("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        com.yorku.lab.model.Equipment equipment18 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.lang.Class<?> wildcardClass21 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment18 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipmentOptional20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("hi!", "", "hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentList21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "hi!", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.markMaintenance("hi!");
        java.lang.Class<?> wildcardClass5 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional5 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentOptional5);
        org.junit.Assert.assertNotNull(equipmentOptional7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment27 = equipmentManagementService0.addEquipment("", "", "hi!");
        com.yorku.lab.model.Equipment equipment31 = equipmentManagementService0.addEquipment("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipment27);
        org.junit.Assert.assertNotNull(equipment31);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional3 = equipmentManagementService0.markMaintenance("hi!");
        com.yorku.lab.model.Equipment equipment7 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentOptional3);
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment27 = equipmentManagementService0.addEquipment("hi!", "", "hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipment27);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.getEquipment("hi!");
        java.lang.Class<?> wildcardClass12 = equipmentOptional11.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.getEquipment("");
        java.lang.Class<?> wildcardClass15 = equipmentOptional14.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment18 = equipmentManagementService0.addEquipment("", "", "hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipment18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.markMaintenance("hi!");
        java.lang.Class<?> wildcardClass5 = equipmentOptional4.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.lang.Class<?> wildcardClass10 = equipmentList9.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentOptional20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional5 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentOptional5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentManagementService0.markMaintenance("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.lang.Class<?> wildcardClass9 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("", "", "");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList24 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipmentList24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("hi!", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.disableEquipment("");
        java.lang.Class<?> wildcardClass23 = equipmentOptional22.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "hi!", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment26 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional28 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipment26);
        org.junit.Assert.assertNotNull(equipmentOptional28);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment24 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipment24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList23 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentList23);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional27 = equipmentManagementService0.markMaintenance("hi!");
        java.lang.Class<?> wildcardClass28 = equipmentOptional27.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentOptional27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentManagementService0.markMaintenance("hi!");
        java.lang.Class<?> wildcardClass14 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.markMaintenance("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.getEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.disableEquipment("");
        com.yorku.lab.model.Equipment equipment29 = equipmentManagementService0.addEquipment("", "", "");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList30 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipment29);
        org.junit.Assert.assertNotNull(equipmentList30);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentManagementService0.markMaintenance("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentManagementService0.enableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.disableEquipment("");
        java.lang.Class<?> wildcardClass9 = equipmentManagementService0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.lang.Class<?> wildcardClass3 = equipmentList2.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "hi!", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment14 = equipmentManagementService0.addEquipment("", "", "hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipment14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment22 = equipmentManagementService0.addEquipment("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipment22);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment8 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipment8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "hi!", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentManagementService0.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional5 = equipmentManagementService0.enableEquipment("hi!");
        java.lang.Class<?> wildcardClass6 = equipmentOptional5.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.markMaintenance("");
        com.yorku.lab.model.Equipment equipment26 = equipmentManagementService0.addEquipment("hi!", "", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipment26);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment19 = equipmentManagementService0.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment23 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentManagementService0.getEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList26 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentList26);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "hi!", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional3 = equipmentManagementService0.markMaintenance("hi!");
        com.yorku.lab.model.Equipment equipment7 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentOptional3);
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        com.yorku.lab.model.Equipment equipment13 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentManagementService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentManagementService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipment13);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment18 = equipmentManagementService0.addEquipment("hi!", "hi!", "");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipment18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional5 = equipmentManagementService0.markMaintenance("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentOptional5);
        org.junit.Assert.assertNotNull(equipmentOptional7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.disableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentManagementService0.getEquipment("");
        com.yorku.lab.model.Equipment equipment20 = equipmentManagementService0.addEquipment("", "hi!", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = equipmentManagementService0.enableEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentManagementService0.enableEquipment("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentManagementService0.markMaintenance("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentManagementService0.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.EquipmentManagementService equipmentManagementService0 = new com.yorku.lab.service.EquipmentManagementService();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentManagementService0.disableEquipment("hi!");
        com.yorku.lab.model.Equipment equipment6 = equipmentManagementService0.addEquipment("", "", "hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentManagementService0.enableEquipment("");
        com.yorku.lab.model.Equipment equipment12 = equipmentManagementService0.addEquipment("hi!", "", "");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentManagementService0.markMaintenance("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentManagementService0.listAllEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentManagementService0.markMaintenance("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentManagementService0.disableEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentManagementService0.listAllEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentManagementService0.listAllEquipment();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentList21);
    }
}

