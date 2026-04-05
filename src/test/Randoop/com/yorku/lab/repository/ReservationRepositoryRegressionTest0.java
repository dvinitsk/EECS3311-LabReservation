package com.yorku.lab.repository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationRepositoryRegressionTest0 {

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
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.lang.Class<?> wildcardClass6 = reservationRepository2.getClass();
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.saveAll(reservationList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.lang.Class<?> wildcardClass3 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.lang.Class<?> wildcardClass7 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByUser("hi!");
        java.lang.Class<?> wildcardClass7 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository2.findById("");
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository7 = new com.yorku.lab.repository.ReservationRepository(userRepository5, equipmentRepository6);
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository7.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository7.findByUser("");
        reservationRepository2.saveAll(reservationList10);
        com.yorku.lab.model.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        com.yorku.lab.model.Reservation reservation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository7 = new com.yorku.lab.repository.ReservationRepository(userRepository5, equipmentRepository6);
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository7.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository7.findByUser("");
        reservationRepository2.saveAll(reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository2.findAll();
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.saveAll(reservationList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.lang.Class<?> wildcardClass9 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass9 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByEquipment("hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        java.lang.Class<?> wildcardClass10 = reservationList9.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findAll();
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository2.findByUser("");
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        java.lang.Class<?> wildcardClass7 = reservationRepository2.getClass();
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationOptional12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository2.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.saveAll(reservationList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList22 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findAll();
        java.lang.Class<?> wildcardClass11 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByEquipment("");
        java.lang.Class<?> wildcardClass10 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        reservationRepository2.delete("");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        java.lang.Class<?> wildcardClass5 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findByEquipment("");
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.UserRepository userRepository4 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository6 = new com.yorku.lab.repository.ReservationRepository(userRepository4, equipmentRepository5);
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository6.findByUser("hi!");
        com.yorku.lab.repository.UserRepository userRepository9 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository10 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository(userRepository9, equipmentRepository10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository11.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository11.findByUser("");
        reservationRepository6.saveAll(reservationList14);
        com.yorku.lab.model.Reservation[] reservationArray16 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList17 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList17, reservationArray16);
        reservationRepository6.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList17);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList17);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationArray16);
        org.junit.Assert.assertArrayEquals(reservationArray16, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository9.findAll();
        reservationRepository9.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository9.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = reservationRepository9.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = reservationRepository9.findByEquipment("");
        reservationRepository0.saveAll(reservationList18);
        java.lang.Class<?> wildcardClass20 = reservationList18.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        reservationRepository2.delete("");
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray10 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList11 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList11, reservationArray10);
        reservationRepository9.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList11);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = reservationRepository9.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository9.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = reservationRepository9.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList21 = reservationRepository9.findByUser("");
        reservationRepository2.saveAll(reservationList21);
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList25 = reservationRepository2.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationArray10);
        org.junit.Assert.assertArrayEquals(reservationArray10, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional19);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByEquipment("hi!");
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findAll();
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository2.findByUser("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByEquipment("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findByUser("");
        reservationRepository2.delete("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        reservationRepository2.delete("");
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray10 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList11 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList11, reservationArray10);
        reservationRepository9.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList11);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = reservationRepository9.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository9.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = reservationRepository9.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList21 = reservationRepository9.findByUser("");
        reservationRepository2.saveAll(reservationList21);
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository2.findAll();
        com.yorku.lab.model.Reservation reservation24 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationArray10);
        org.junit.Assert.assertArrayEquals(reservationArray10, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional19);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository6 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository7 = new com.yorku.lab.repository.ReservationRepository(userRepository5, equipmentRepository6);
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository7.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository7.findByUser("");
        reservationRepository2.saveAll(reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList13 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findByEquipment("hi!");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository2.findAll();
        java.lang.Class<?> wildcardClass11 = reservationRepository2.getClass();
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByEquipment("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList20 = reservationRepository0.findAll();
        java.lang.Class<?> wildcardClass21 = reservationList20.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository2.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.saveAll(reservationList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("");
        java.lang.Class<?> wildcardClass10 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList20 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList22 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository11.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList15 = reservationRepository11.findByUser("hi!");
        reservationRepository0.saveAll(reservationList15);
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = reservationRepository0.findByEquipment("");
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList21 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional3 = reservationRepository0.findById("");
        java.lang.Class<?> wildcardClass4 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationOptional3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional3 = reservationRepository0.findById("");
        reservationRepository0.delete("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationOptional3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository2.findById("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByUser("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByUser("hi!");
        com.yorku.lab.model.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository8.findAll();
        reservationRepository8.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList13 = reservationRepository8.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = reservationRepository8.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository8.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository8.findByEquipment("hi!");
        reservationRepository0.saveAll(reservationList19);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findAll();
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.UserRepository userRepository13 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository14 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository15 = new com.yorku.lab.repository.ReservationRepository(userRepository13, equipmentRepository14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository15.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = reservationRepository15.findById("hi!");
        reservationRepository15.delete("");
        com.yorku.lab.repository.ReservationRepository reservationRepository22 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray23 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList24 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList24, reservationArray23);
        reservationRepository22.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList24);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional28 = reservationRepository22.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList30 = reservationRepository22.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional32 = reservationRepository22.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList34 = reservationRepository22.findByUser("");
        reservationRepository15.saveAll(reservationList34);
        java.util.List<com.yorku.lab.model.Reservation> reservationList36 = reservationRepository15.findAll();
        com.yorku.lab.repository.UserRepository userRepository37 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository38 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository39 = new com.yorku.lab.repository.ReservationRepository(userRepository37, equipmentRepository38);
        java.util.List<com.yorku.lab.model.Reservation> reservationList40 = reservationRepository39.findAll();
        reservationRepository15.saveAll(reservationList40);
        java.util.List<com.yorku.lab.model.Reservation> reservationList43 = reservationRepository15.findByEquipment("");
        reservationRepository0.saveAll(reservationList43);
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional19);
        org.junit.Assert.assertNotNull(reservationArray23);
        org.junit.Assert.assertArrayEquals(reservationArray23, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(reservationOptional28);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationOptional32);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNotNull(reservationList43);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findByUser("");
        com.yorku.lab.repository.UserRepository userRepository4 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository6 = new com.yorku.lab.repository.ReservationRepository(userRepository4, equipmentRepository5);
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository6.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository6.findByEquipment("");
        com.yorku.lab.repository.UserRepository userRepository10 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository12 = new com.yorku.lab.repository.ReservationRepository(userRepository10, equipmentRepository11);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = reservationRepository12.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = reservationRepository12.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository12.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository18 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray19 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList20 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList20, reservationArray19);
        reservationRepository18.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList20);
        java.util.List<com.yorku.lab.model.Reservation> reservationList24 = reservationRepository18.findByEquipment("");
        reservationRepository12.saveAll(reservationList24);
        reservationRepository6.saveAll(reservationList24);
        reservationRepository0.saveAll(reservationList24);
        java.lang.Class<?> wildcardClass28 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationOptional14);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationArray19);
        org.junit.Assert.assertArrayEquals(reservationArray19, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository2.findByUser("hi!");
        com.yorku.lab.repository.ReservationRepository reservationRepository18 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray19 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList20 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList20, reservationArray19);
        reservationRepository18.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList20);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional24 = reservationRepository18.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList26 = reservationRepository18.findByEquipment("");
        reservationRepository2.saveAll(reservationList26);
        java.util.List<com.yorku.lab.model.Reservation> reservationList28 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList30 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationArray19);
        org.junit.Assert.assertArrayEquals(reservationArray19, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(reservationOptional24);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList30);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        reservationRepository0.delete("");
        reservationRepository0.delete("");
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.lang.Class<?> wildcardClass1 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.repository.UserRepository userRepository1 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository2 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository3 = new com.yorku.lab.repository.ReservationRepository(userRepository1, equipmentRepository2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional5 = reservationRepository3.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository3.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository3.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray10 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList11 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList11, reservationArray10);
        reservationRepository9.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList11);
        java.util.List<com.yorku.lab.model.Reservation> reservationList15 = reservationRepository9.findByEquipment("");
        reservationRepository3.saveAll(reservationList15);
        reservationRepository0.saveAll(reservationList15);
        reservationRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(reservationOptional5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationArray10);
        org.junit.Assert.assertArrayEquals(reservationArray10, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.lang.Class<?> wildcardClass3 = reservationRepository2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByUser("");
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByUser("hi!");
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository2.findById("");
        java.lang.Class<?> wildcardClass11 = reservationOptional10.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = reservationList5.getClass();
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.saveAll(reservationList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findByUser("");
        com.yorku.lab.repository.UserRepository userRepository4 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository5 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository6 = new com.yorku.lab.repository.ReservationRepository(userRepository4, equipmentRepository5);
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository6.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository6.findByEquipment("");
        com.yorku.lab.repository.UserRepository userRepository10 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository11 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository12 = new com.yorku.lab.repository.ReservationRepository(userRepository10, equipmentRepository11);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = reservationRepository12.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = reservationRepository12.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository12.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository18 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray19 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList20 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList20, reservationArray19);
        reservationRepository18.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList20);
        java.util.List<com.yorku.lab.model.Reservation> reservationList24 = reservationRepository18.findByEquipment("");
        reservationRepository12.saveAll(reservationList24);
        reservationRepository6.saveAll(reservationList24);
        reservationRepository0.saveAll(reservationList24);
        java.util.List<com.yorku.lab.model.Reservation> reservationList29 = reservationRepository0.findByEquipment("hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationOptional14);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationArray19);
        org.junit.Assert.assertArrayEquals(reservationArray19, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository20 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository21 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository22 = new com.yorku.lab.repository.ReservationRepository(userRepository20, equipmentRepository21);
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository22.findAll();
        reservationRepository0.saveAll(reservationList23);
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findAll();
        java.lang.Class<?> wildcardClass11 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository2.findByUser("hi!");
        com.yorku.lab.repository.ReservationRepository reservationRepository18 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray19 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList20 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList20, reservationArray19);
        reservationRepository18.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList20);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional24 = reservationRepository18.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList26 = reservationRepository18.findByEquipment("");
        reservationRepository2.saveAll(reservationList26);
        java.lang.Class<?> wildcardClass28 = reservationList26.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationArray19);
        org.junit.Assert.assertArrayEquals(reservationArray19, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(reservationOptional24);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findByUser("hi!");
        java.lang.Class<?> wildcardClass9 = reservationRepository2.getClass();
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = reservationRepository0.findByEquipment("");
        reservationRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass21 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByUser("");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findByUser("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = reservationRepository2.findById("");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findAll();
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList13 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByUser("hi!");
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        reservationRepository0.delete("");
        reservationRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByUser("");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findByUser("");
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        java.lang.Class<?> wildcardClass20 = reservationRepository0.getClass();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository2.findById("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByUser("");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository2.findAll();
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository11.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList15 = reservationRepository11.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository11.findByEquipment("");
        reservationRepository0.saveAll(reservationList17);
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional3 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationOptional3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.lang.Class<?> wildcardClass7 = reservationOptional6.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList20 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList22 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = reservationRepository0.findById("");
        com.yorku.lab.repository.ReservationRepository reservationRepository3 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository3.findAll();
        reservationRepository3.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository3.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository3.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository3.findByUser("hi!");
        reservationRepository0.saveAll(reservationList14);
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        reservationRepository2.delete("hi!");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = reservationRepository0.findById("hi!");
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = reservationRepository0.findById("hi!");
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByUser("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("hi!");
        reservationRepository2.delete("");
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray10 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList11 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList11, reservationArray10);
        reservationRepository9.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList11);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = reservationRepository9.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository9.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = reservationRepository9.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList21 = reservationRepository9.findByUser("");
        reservationRepository2.saveAll(reservationList21);
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository2.findAll();
        com.yorku.lab.repository.UserRepository userRepository24 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository25 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository26 = new com.yorku.lab.repository.ReservationRepository(userRepository24, equipmentRepository25);
        java.util.List<com.yorku.lab.model.Reservation> reservationList27 = reservationRepository26.findAll();
        reservationRepository2.saveAll(reservationList27);
        java.util.List<com.yorku.lab.model.Reservation> reservationList30 = reservationRepository2.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional32 = reservationRepository2.findById("hi!");
        com.yorku.lab.repository.ReservationRepository reservationRepository33 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList34 = reservationRepository33.findAll();
        reservationRepository33.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList38 = reservationRepository33.findByEquipment("");
        reservationRepository2.saveAll(reservationList38);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationArray10);
        org.junit.Assert.assertArrayEquals(reservationArray10, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional19);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationOptional32);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertNotNull(reservationList38);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository9.findAll();
        reservationRepository9.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository9.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = reservationRepository9.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = reservationRepository9.findByEquipment("");
        reservationRepository0.saveAll(reservationList18);
        com.yorku.lab.repository.ReservationRepository reservationRepository20 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList21 = reservationRepository20.findAll();
        reservationRepository20.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList25 = reservationRepository20.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional27 = reservationRepository20.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList29 = reservationRepository20.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList31 = reservationRepository20.findByUser("hi!");
        reservationRepository0.saveAll(reservationList31);
        reservationRepository0.delete("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationOptional27);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList31);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository2.findByUser("hi!");
        java.lang.Class<?> wildcardClass18 = reservationRepository2.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = reservationRepository0.findById("");
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationOptional12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByEquipment("");
        com.yorku.lab.model.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository2.findById("hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository9 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository9.findAll();
        reservationRepository9.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository9.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = reservationRepository9.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = reservationRepository9.findByEquipment("");
        reservationRepository0.saveAll(reservationList18);
        java.util.List<com.yorku.lab.model.Reservation> reservationList20 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList22 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByUser("");
        reservationRepository2.delete("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = reservationRepository2.findById("");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByUser("");
        reservationRepository2.delete("");
        reservationRepository2.delete("");
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.save(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findAll();
        java.lang.Class<?> wildcardClass7 = reservationList6.getClass();
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationOptional21);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByUser("hi!");
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findByUser("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList16 = reservationRepository0.findByUser("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationOptional14);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByEquipment("hi!");
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository0.findAll();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = reservationRepository0.findById("hi!");
        reservationRepository0.delete("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationOptional12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList16 = reservationRepository2.findAll();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        com.yorku.lab.model.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList21 = reservationRepository0.findByUser("");
        com.yorku.lab.model.Reservation reservation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.save(reservation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getReservationId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.lang.Class<?> wildcardClass6 = reservationList5.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList19 = reservationRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList23 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationOptional21);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository0.saveAll(reservationList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList2 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        java.lang.Class<?> wildcardClass5 = reservationList4.getClass();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = reservationRepository0.findById("");
        reservationRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList22 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.List<com.yorku.lab.model.Reservation> reservationList1 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findByEquipment("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationRepository2.saveAll(reservationList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByEquipment("");
        com.yorku.lab.repository.ReservationRepository reservationRepository11 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray12 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList13 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList13, reservationArray12);
        reservationRepository11.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList13);
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = reservationRepository0.findByEquipment("");
        reservationRepository0.delete("hi!");
        reservationRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        com.yorku.lab.repository.ReservationRepository reservationRepository8 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray9 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList10 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList10, reservationArray9);
        reservationRepository8.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList14 = reservationRepository8.findByEquipment("");
        reservationRepository2.saveAll(reservationList14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = reservationRepository2.findByUser("hi!");
        com.yorku.lab.repository.ReservationRepository reservationRepository18 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray19 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList20 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList20, reservationArray19);
        reservationRepository18.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList20);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional24 = reservationRepository18.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList26 = reservationRepository18.findByEquipment("");
        reservationRepository2.saveAll(reservationList26);
        java.util.List<com.yorku.lab.model.Reservation> reservationList28 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList30 = reservationRepository2.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationArray9);
        org.junit.Assert.assertArrayEquals(reservationArray9, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationArray19);
        org.junit.Assert.assertArrayEquals(reservationArray19, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(reservationOptional24);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList30);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList11 = reservationRepository0.findByUser("hi!");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = reservationRepository0.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = reservationRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = reservationRepository0.findById("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationOptional12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        com.yorku.lab.model.Reservation[] reservationArray1 = new com.yorku.lab.model.Reservation[] {};
        java.util.ArrayList<com.yorku.lab.model.Reservation> reservationList2 = new java.util.ArrayList<com.yorku.lab.model.Reservation>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.Reservation>) reservationList2, reservationArray1);
        reservationRepository0.saveAll((java.util.List<com.yorku.lab.model.Reservation>) reservationList2);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findByEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = reservationRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository0.findByUser("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository0.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationArray1);
        org.junit.Assert.assertArrayEquals(reservationArray1, new com.yorku.lab.model.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = new com.yorku.lab.repository.ReservationRepository();
        reservationRepository0.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository0.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository0.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository0.findAll();
        reservationRepository0.delete("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = reservationRepository2.findById("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = reservationRepository2.findByEquipment("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = reservationRepository2.findByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = reservationRepository2.findByEquipment("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = reservationRepository2.findByEquipment("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.repository.UserRepository userRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.ReservationRepository reservationRepository2 = new com.yorku.lab.repository.ReservationRepository(userRepository0, equipmentRepository1);
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = reservationRepository2.findByUser("hi!");
        reservationRepository2.delete("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = reservationRepository2.findAll();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = reservationRepository2.findByUser("");
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList9);
    }
}

