package com.yorku.lab.repository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentRepositoryRegressionTest0 {

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
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass3 = equipmentOptional2.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        equipmentRepository0.delete("hi!");
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass3 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository6.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray8 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList9 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList9, equipmentArray8);
        equipmentRepository6.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        com.yorku.lab.model.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        java.lang.Class<?> wildcardClass7 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = equipmentList9.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        equipmentRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass5 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository6.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray8 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList9 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList9, equipmentArray8);
        equipmentRepository6.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        java.lang.Class<?> wildcardClass13 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.model.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository6.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray8 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList9 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList9, equipmentArray8);
        equipmentRepository6.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        java.lang.Class<?> wildcardClass13 = equipmentList9.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        java.lang.Class<?> wildcardClass5 = equipmentList2.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        com.yorku.lab.model.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.lang.Class<?> wildcardClass9 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository13 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository13.findAll();
        equipmentRepository0.saveAll(equipmentList14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentOptional17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass2 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass8 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        com.yorku.lab.model.Equipment equipment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        equipmentRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass24 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository15 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository15.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository15.findById("");
        equipmentRepository15.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList22 = equipmentRepository15.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository23 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentRepository23.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional27 = equipmentRepository23.findById("");
        equipmentRepository23.delete("");
        equipmentRepository23.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional33 = equipmentRepository23.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray34 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList35 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList35, equipmentArray34);
        equipmentRepository23.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList35);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList38 = equipmentRepository23.findAll();
        equipmentRepository15.saveAll(equipmentList38);
        equipmentRepository0.saveAll(equipmentList38);
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentOptional27);
        org.junit.Assert.assertNotNull(equipmentOptional33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(equipmentList38);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository13 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository13.findAll();
        equipmentRepository0.saveAll(equipmentList14);
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass8 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.lang.Class<?> wildcardClass22 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository10 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository10.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository10.findById("");
        equipmentRepository10.delete("");
        equipmentRepository10.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentRepository10.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository10.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList26 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository6.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray8 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList9 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList9, equipmentArray8);
        equipmentRepository6.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository13 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository13.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository13.findById("");
        equipmentRepository13.delete("");
        equipmentRepository13.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository13.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray24 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList25 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList25, equipmentArray24);
        equipmentRepository13.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList25);
        equipmentRepository13.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional31 = equipmentRepository13.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository32 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList33 = equipmentRepository32.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray34 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList35 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList35, equipmentArray34);
        equipmentRepository32.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList35);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional39 = equipmentRepository32.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository40 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList41 = equipmentRepository40.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray42 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList43 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList43, equipmentArray42);
        equipmentRepository40.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList43);
        equipmentRepository32.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList43);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList47 = equipmentRepository32.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList48 = equipmentRepository32.findAll();
        equipmentRepository13.saveAll(equipmentList48);
        equipmentRepository0.saveAll(equipmentList48);
        com.yorku.lab.model.Equipment equipment51 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentArray24);
        org.junit.Assert.assertArrayEquals(equipmentArray24, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(equipmentOptional31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(equipmentOptional39);
        org.junit.Assert.assertNotNull(equipmentList41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(equipmentList47);
        org.junit.Assert.assertNotNull(equipmentList48);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass9 = equipmentOptional8.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment equipment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        com.yorku.lab.model.Equipment equipment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass8 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment equipment24 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.lang.Class<?> wildcardClass13 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository19.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList25 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList25);
        java.lang.Class<?> wildcardClass27 = equipmentList25.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentList25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository16 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository16.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray18 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList19 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList19, equipmentArray18);
        equipmentRepository16.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList19);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository16.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository24 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList25 = equipmentRepository24.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray26 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList27 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList27, equipmentArray26);
        equipmentRepository24.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList27);
        equipmentRepository16.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList27);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList31 = equipmentRepository16.findAll();
        equipmentRepository0.saveAll(equipmentList31);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentArray18);
        org.junit.Assert.assertArrayEquals(equipmentArray18, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentList25);
        org.junit.Assert.assertNotNull(equipmentArray26);
        org.junit.Assert.assertArrayEquals(equipmentArray26, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(equipmentList31);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        equipmentRepository5.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository18.findAll();
        equipmentRepository5.saveAll(equipmentList19);
        equipmentRepository0.saveAll(equipmentList19);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass24 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass24 = equipmentOptional23.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        java.lang.Class<?> wildcardClass14 = equipmentList12.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository6.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray8 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList9 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList9, equipmentArray8);
        equipmentRepository6.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        equipmentRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass9 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository16 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository16.findAll();
        equipmentRepository0.saveAll(equipmentList17);
        com.yorku.lab.model.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = equipmentOptional10.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray12 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList13 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList13, equipmentArray12);
        equipmentRepository11.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList13);
        equipmentRepository11.delete("");
        equipmentRepository11.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentRepository11.findById("");
        equipmentRepository11.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentRepository11.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList26 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList26);
        java.lang.Class<?> wildcardClass28 = equipmentList26.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray12);
        org.junit.Assert.assertArrayEquals(equipmentArray12, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentList26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList28 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository9 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentRepository9.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentRepository9.findById("");
        equipmentRepository9.delete("");
        equipmentRepository9.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository9.findById("hi!");
        equipmentRepository9.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository22 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList23 = equipmentRepository22.findAll();
        equipmentRepository9.saveAll(equipmentList23);
        equipmentRepository0.saveAll(equipmentList23);
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentList23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass16 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository14 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentRepository14.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository14.findById("");
        equipmentRepository14.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentRepository14.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository22 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentRepository22.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository22.findById("");
        equipmentRepository22.delete("");
        equipmentRepository22.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional32 = equipmentRepository22.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray33 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList34 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList34, equipmentArray33);
        equipmentRepository22.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList34);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList37 = equipmentRepository22.findAll();
        equipmentRepository14.saveAll(equipmentList37);
        equipmentRepository0.saveAll(equipmentList37);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList40 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList21);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentOptional32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.lang.Class<?> wildcardClass12 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        equipmentRepository0.delete("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList22 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        equipmentRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment28 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository0.findAll();
        equipmentRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass17 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass5 = equipmentOptional4.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass8 = equipmentList7.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository14 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentRepository14.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository14.findById("");
        equipmentRepository14.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentRepository14.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository22 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentRepository22.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository22.findById("");
        equipmentRepository22.delete("");
        equipmentRepository22.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional32 = equipmentRepository22.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray33 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList34 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList34, equipmentArray33);
        equipmentRepository22.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList34);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList37 = equipmentRepository22.findAll();
        equipmentRepository14.saveAll(equipmentList37);
        equipmentRepository0.saveAll(equipmentList37);
        com.yorku.lab.model.Equipment equipment40 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList21);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentOptional32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository19.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository19.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository27 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList28 = equipmentRepository27.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray29 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList30 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList30, equipmentArray29);
        equipmentRepository27.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList34 = equipmentRepository19.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList35 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList35);
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(equipmentList34);
        org.junit.Assert.assertNotNull(equipmentList35);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass3 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        equipmentRepository5.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository18.findAll();
        equipmentRepository5.saveAll(equipmentList19);
        equipmentRepository0.saveAll(equipmentList19);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList22 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository7 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = equipmentRepository7.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository7.findAll();
        equipmentRepository7.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository7.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository19.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList25 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList25);
        com.yorku.lab.model.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentList25);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository13 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository13.findAll();
        equipmentRepository0.saveAll(equipmentList14);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository12 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray13 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList14 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList14, equipmentArray13);
        equipmentRepository12.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentOptional19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository0.findById("");
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass7 = equipmentList6.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository10 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository10.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository10.findById("");
        equipmentRepository10.delete("");
        equipmentRepository10.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentRepository10.findById("hi!");
        equipmentRepository10.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList23 = equipmentRepository10.findAll();
        equipmentRepository0.saveAll(equipmentList23);
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipmentList23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository15 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = equipmentRepository15.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray17 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList18 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList18, equipmentArray17);
        equipmentRepository15.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList18);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList18);
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(equipmentArray17);
        org.junit.Assert.assertArrayEquals(equipmentArray17, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository6.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray8 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList9 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList9, equipmentArray8);
        equipmentRepository6.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList9);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository13 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository13.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository13.findById("");
        equipmentRepository13.delete("");
        equipmentRepository13.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository13.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray24 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList25 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList25, equipmentArray24);
        equipmentRepository13.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList25);
        equipmentRepository13.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional31 = equipmentRepository13.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository32 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList33 = equipmentRepository32.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray34 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList35 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList35, equipmentArray34);
        equipmentRepository32.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList35);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional39 = equipmentRepository32.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository40 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList41 = equipmentRepository40.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray42 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList43 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList43, equipmentArray42);
        equipmentRepository40.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList43);
        equipmentRepository32.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList43);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList47 = equipmentRepository32.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList48 = equipmentRepository32.findAll();
        equipmentRepository13.saveAll(equipmentList48);
        equipmentRepository0.saveAll(equipmentList48);
        java.lang.Class<?> wildcardClass51 = equipmentList48.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentArray8);
        org.junit.Assert.assertArrayEquals(equipmentArray8, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentArray24);
        org.junit.Assert.assertArrayEquals(equipmentArray24, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(equipmentOptional31);
        org.junit.Assert.assertNotNull(equipmentList33);
        org.junit.Assert.assertNotNull(equipmentArray34);
        org.junit.Assert.assertArrayEquals(equipmentArray34, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(equipmentOptional39);
        org.junit.Assert.assertNotNull(equipmentList41);
        org.junit.Assert.assertNotNull(equipmentArray42);
        org.junit.Assert.assertArrayEquals(equipmentArray42, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(equipmentList47);
        org.junit.Assert.assertNotNull(equipmentList48);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository17 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = equipmentRepository17.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray19 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList20 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList20, equipmentArray19);
        equipmentRepository17.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList20);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList23 = equipmentRepository17.findAll();
        equipmentRepository0.saveAll(equipmentList23);
        com.yorku.lab.model.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(equipmentArray19);
        org.junit.Assert.assertArrayEquals(equipmentArray19, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(equipmentList23);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository18.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray20 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList21 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList21, equipmentArray20);
        equipmentRepository18.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList21);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList21);
        java.lang.Class<?> wildcardClass25 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList26 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional25);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository8.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository8.findById("");
        equipmentRepository8.delete("");
        equipmentRepository8.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository8.findAll();
        equipmentRepository0.saveAll(equipmentList17);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentRepository19.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository19.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional25 = equipmentRepository19.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList26 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList26);
        java.lang.Class<?> wildcardClass28 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentOptional25);
        org.junit.Assert.assertNotNull(equipmentList26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository16 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository16.findAll();
        equipmentRepository0.saveAll(equipmentList17);
        equipmentRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentList21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        equipmentRepository5.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository18.findAll();
        equipmentRepository5.saveAll(equipmentList19);
        equipmentRepository0.saveAll(equipmentList19);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList24 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentList24);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository8.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository8.findById("");
        equipmentRepository8.delete("");
        equipmentRepository8.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository8.findAll();
        equipmentRepository0.saveAll(equipmentList17);
        com.yorku.lab.model.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository10 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository10.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository10.findAll();
        equipmentRepository10.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository10.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository10.findById("");
        equipmentRepository10.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository10.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository12 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray13 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList14 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList14, equipmentArray13);
        equipmentRepository12.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList22 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass23 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository13 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository13.findAll();
        equipmentRepository0.saveAll(equipmentList14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository0.findById("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentOptional17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.lang.Class<?> wildcardClass1 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository9 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional11 = equipmentRepository9.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = equipmentRepository9.findById("");
        equipmentRepository9.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = equipmentRepository9.findAll();
        equipmentRepository9.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository9.findAll();
        equipmentRepository0.saveAll(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository5.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository5.findById("");
        equipmentRepository5.delete("");
        equipmentRepository5.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional15 = equipmentRepository5.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray16 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList17 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList17, equipmentArray16);
        equipmentRepository5.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository5.findAll();
        equipmentRepository0.saveAll(equipmentList20);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository28 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList29 = equipmentRepository28.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray30 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList31 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList31, equipmentArray30);
        equipmentRepository28.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList31);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository34 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList35 = equipmentRepository34.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray36 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList37 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList37, equipmentArray36);
        equipmentRepository34.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList37);
        equipmentRepository28.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList37);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository41 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional43 = equipmentRepository41.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional45 = equipmentRepository41.findById("");
        equipmentRepository41.delete("");
        equipmentRepository41.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional51 = equipmentRepository41.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray52 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList53 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList53, equipmentArray52);
        equipmentRepository41.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList53);
        equipmentRepository41.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional59 = equipmentRepository41.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository60 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList61 = equipmentRepository60.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray62 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList63 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList63, equipmentArray62);
        equipmentRepository60.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList63);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional67 = equipmentRepository60.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository68 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList69 = equipmentRepository68.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray70 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList71 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList71, equipmentArray70);
        equipmentRepository68.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList71);
        equipmentRepository60.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList71);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList75 = equipmentRepository60.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList76 = equipmentRepository60.findAll();
        equipmentRepository41.saveAll(equipmentList76);
        equipmentRepository28.saveAll(equipmentList76);
        equipmentRepository0.saveAll(equipmentList76);
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
        org.junit.Assert.assertNotNull(equipmentOptional15);
        org.junit.Assert.assertNotNull(equipmentArray16);
        org.junit.Assert.assertArrayEquals(equipmentArray16, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional23);
        org.junit.Assert.assertNotNull(equipmentList29);
        org.junit.Assert.assertNotNull(equipmentArray30);
        org.junit.Assert.assertArrayEquals(equipmentArray30, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(equipmentArray36);
        org.junit.Assert.assertArrayEquals(equipmentArray36, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(equipmentOptional43);
        org.junit.Assert.assertNotNull(equipmentOptional45);
        org.junit.Assert.assertNotNull(equipmentOptional51);
        org.junit.Assert.assertNotNull(equipmentArray52);
        org.junit.Assert.assertArrayEquals(equipmentArray52, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(equipmentOptional59);
        org.junit.Assert.assertNotNull(equipmentList61);
        org.junit.Assert.assertNotNull(equipmentArray62);
        org.junit.Assert.assertArrayEquals(equipmentArray62, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(equipmentOptional67);
        org.junit.Assert.assertNotNull(equipmentList69);
        org.junit.Assert.assertNotNull(equipmentArray70);
        org.junit.Assert.assertArrayEquals(equipmentArray70, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(equipmentList75);
        org.junit.Assert.assertNotNull(equipmentList76);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository19.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository19.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository27 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList28 = equipmentRepository27.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray29 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList30 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList30, equipmentArray29);
        equipmentRepository27.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList34 = equipmentRepository19.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList35 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList35);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional38 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment41 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(equipmentList34);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(equipmentOptional38);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentRepository0.findById("");
        java.lang.Class<?> wildcardClass17 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray19 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList20 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList20, equipmentArray19);
        equipmentRepository18.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList20);
        equipmentRepository18.delete("");
        equipmentRepository18.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional28 = equipmentRepository18.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository29 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList30 = equipmentRepository29.findAll();
        equipmentRepository18.saveAll(equipmentList30);
        equipmentRepository0.saveAll(equipmentList30);
        java.lang.Class<?> wildcardClass33 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(equipmentArray19);
        org.junit.Assert.assertArrayEquals(equipmentArray19, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(equipmentOptional28);
        org.junit.Assert.assertNotNull(equipmentList30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository12 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray13 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList14 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList14, equipmentArray13);
        equipmentRepository12.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.lang.Class<?> wildcardClass22 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository9 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = equipmentRepository9.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository9.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentRepository9.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository17 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = equipmentRepository17.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray19 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList20 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList20, equipmentArray19);
        equipmentRepository17.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList20);
        equipmentRepository9.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList20);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(equipmentArray19);
        org.junit.Assert.assertArrayEquals(equipmentArray19, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        java.lang.Class<?> wildcardClass15 = equipmentList12.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository8.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository8.findById("");
        equipmentRepository8.delete("");
        equipmentRepository8.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository8.findAll();
        equipmentRepository0.saveAll(equipmentList17);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentOptional20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository19.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository19.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository27 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList28 = equipmentRepository27.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray29 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList30 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList30, equipmentArray29);
        equipmentRepository27.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList34 = equipmentRepository19.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList35 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList35);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional38 = equipmentRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass39 = equipmentOptional38.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(equipmentList34);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(equipmentOptional38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = equipmentRepository11.findAll();
        equipmentRepository0.saveAll(equipmentList12);
        com.yorku.lab.repository.EquipmentRepository equipmentRepository14 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional16 = equipmentRepository14.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository14.findById("");
        equipmentRepository14.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList21 = equipmentRepository14.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository22 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = equipmentRepository22.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository22.findById("");
        equipmentRepository22.delete("");
        equipmentRepository22.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional32 = equipmentRepository22.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray33 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList34 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList34, equipmentArray33);
        equipmentRepository22.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList34);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList37 = equipmentRepository22.findAll();
        equipmentRepository14.saveAll(equipmentList37);
        equipmentRepository0.saveAll(equipmentList37);
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(equipmentOptional16);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList21);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentOptional32);
        org.junit.Assert.assertNotNull(equipmentArray33);
        org.junit.Assert.assertArrayEquals(equipmentArray33, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = equipmentList11.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList14 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.saveAll(equipmentList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray11 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList12 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList12, equipmentArray11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList12);
        equipmentRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional18 = equipmentRepository0.findById("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository19 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = equipmentRepository19.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional26 = equipmentRepository19.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository27 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList28 = equipmentRepository27.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray29 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList30 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList30, equipmentArray29);
        equipmentRepository27.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        equipmentRepository19.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList30);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList34 = equipmentRepository19.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList35 = equipmentRepository19.findAll();
        equipmentRepository0.saveAll(equipmentList35);
        java.lang.Class<?> wildcardClass37 = equipmentList35.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentArray11);
        org.junit.Assert.assertArrayEquals(equipmentArray11, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(equipmentOptional18);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentOptional26);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(equipmentArray29);
        org.junit.Assert.assertArrayEquals(equipmentArray29, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(equipmentList34);
        org.junit.Assert.assertNotNull(equipmentList35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository10 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = equipmentRepository10.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository10.findById("");
        equipmentRepository10.delete("");
        equipmentRepository10.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentRepository10.findById("hi!");
        com.yorku.lab.model.Equipment[] equipmentArray21 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList22 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList22, equipmentArray21);
        equipmentRepository10.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList22);
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList28 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass29 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentOptional12);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentOptional20);
        org.junit.Assert.assertNotNull(equipmentArray21);
        org.junit.Assert.assertArrayEquals(equipmentArray21, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(equipmentList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass14 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = equipmentRepository0.findAll();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository12 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray13 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList14 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList14, equipmentArray13);
        equipmentRepository12.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional19 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional21 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional23 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentArray13);
        org.junit.Assert.assertArrayEquals(equipmentArray13, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentOptional19);
        org.junit.Assert.assertNotNull(equipmentOptional21);
        org.junit.Assert.assertNotNull(equipmentOptional23);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        org.junit.Assert.assertNotNull(equipmentOptional2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository18.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray20 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList21 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList21, equipmentArray20);
        equipmentRepository18.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList21);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList21);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList25 = equipmentRepository0.findAll();
        equipmentRepository0.delete("hi!");
        com.yorku.lab.model.Equipment equipment28 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(equipmentList25);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentOptional17);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        com.yorku.lab.model.Equipment[] equipmentArray1 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList2 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList2, equipmentArray1);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList2);
        equipmentRepository0.delete("");
        equipmentRepository0.delete("hi!");
        equipmentRepository0.delete("");
        java.lang.Class<?> wildcardClass11 = equipmentRepository0.getClass();
        org.junit.Assert.assertNotNull(equipmentArray1);
        org.junit.Assert.assertArrayEquals(equipmentArray1, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray2 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList3 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList3, equipmentArray2);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = equipmentRepository0.findById("hi!");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository8 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = equipmentRepository8.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray10 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList11 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList11, equipmentArray10);
        equipmentRepository8.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList11);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository18 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = equipmentRepository18.findAll();
        com.yorku.lab.model.Equipment[] equipmentArray20 = new com.yorku.lab.model.Equipment[] {};
        java.util.ArrayList<com.yorku.lab.model.Equipment> equipmentList21 = new java.util.ArrayList<com.yorku.lab.model.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Equipment>) equipmentList21, equipmentArray20);
        equipmentRepository18.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList21);
        equipmentRepository0.saveAll((java.util.List<com.yorku.lab.model.Equipment>) equipmentList21);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList25 = equipmentRepository0.findAll();
        java.lang.Class<?> wildcardClass26 = equipmentList25.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentArray2);
        org.junit.Assert.assertArrayEquals(equipmentArray2, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(equipmentOptional7);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(equipmentArray10);
        org.junit.Assert.assertArrayEquals(equipmentArray10, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertNotNull(equipmentArray20);
        org.junit.Assert.assertArrayEquals(equipmentArray20, new com.yorku.lab.model.Equipment[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(equipmentList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional2 = equipmentRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional4 = equipmentRepository0.findById("");
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = equipmentRepository0.findById("hi!");
        equipmentRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional14 = equipmentRepository0.findById("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList15 = equipmentRepository0.findAll();
        com.yorku.lab.repository.EquipmentRepository equipmentRepository16 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList17 = equipmentRepository16.findAll();
        equipmentRepository0.saveAll(equipmentList17);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional20 = equipmentRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(equipmentOptional2);
        org.junit.Assert.assertNotNull(equipmentOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional10);
        org.junit.Assert.assertNotNull(equipmentOptional14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentOptional20);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.yorku.lab.repository.EquipmentRepository equipmentRepository0 = new com.yorku.lab.repository.EquipmentRepository();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = equipmentRepository0.findAll();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = equipmentRepository0.findAll();
        equipmentRepository0.delete("");
        equipmentRepository0.delete("");
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipmentRepository0.save(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.getEquipmentId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }
}

