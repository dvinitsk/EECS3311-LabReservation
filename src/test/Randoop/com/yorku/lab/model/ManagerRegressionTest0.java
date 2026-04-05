package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagerRegressionTest0 {

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
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.Class<?> wildcardClass4 = manager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        java.lang.Class<?> wildcardClass11 = manager3.getClass();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        manager3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        manager3.setStatus(accountStatus13);
        manager3.setActive(false);
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        com.yorku.lab.model.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        com.yorku.lab.enums.AccountStatus accountStatus6 = manager3.getStatus();
        org.junit.Assert.assertNull(accountStatus6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType25 = null;
        manager3.setAffiliation(affiliationType25);
        java.lang.Class<?> wildcardClass27 = manager3.getClass();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.addEquipment("", "", "");
        manager3.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType25 = null;
        manager3.setAffiliation(affiliationType25);
        com.yorku.lab.model.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = manager3.getType();
        com.yorku.lab.enums.AccountStatus accountStatus5 = null;
        manager3.setStatus(accountStatus5);
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType4.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        com.yorku.lab.enums.AccountStatus accountStatus21 = manager3.getStatus();
        com.yorku.lab.enums.AffiliationType affiliationType22 = manager3.getAffiliation();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertTrue("'" + affiliationType22 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType22.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = manager3.getType();
        manager3.addEquipment("", "", "");
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType4.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus11 = manager3.getStatus();
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        manager3.setStatus(accountStatus12);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "", credentials2, "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials11 = manager3.getCredentials();
        com.yorku.lab.enums.UserType userType12 = manager3.getType();
        com.yorku.lab.model.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType12.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        com.yorku.lab.model.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus11 = manager3.getStatus();
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        java.lang.String str8 = manager3.getFullName();
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        double double23 = manager3.getHourlyRate();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        boolean boolean11 = manager3.isActive();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        manager3.setHourlyRate((double) 1);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        manager3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        manager3.setStatus(accountStatus13);
        java.lang.String str15 = manager3.getDepartment();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        com.yorku.lab.enums.AffiliationType affiliationType11 = manager3.getAffiliation();
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertTrue("'" + affiliationType11 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType11.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus7 = null;
        manager3.setStatus(accountStatus7);
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.addEquipment("", "", "");
        manager3.setDepartment("");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        boolean boolean9 = manager3.isActive();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.addEquipment("", "", "");
        manager3.addEquipment("hi!", "", "");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("hi!", "", credentials2, "");
        java.lang.String str5 = manager4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        manager3.setDepartment("");
        manager3.setUserId("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setIdOrCertificationNumber("hi!");
        manager3.setActive(true);
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        manager3.setAffiliation(affiliationType13);
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.enums.UserType userType10 = manager3.getType();
        manager3.setIdOrCertificationNumber("hi!");
        manager3.setFullName("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType10.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials11 = manager3.getCredentials();
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(credentials11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        manager3.addEquipment("", "", "hi!");
        boolean boolean15 = manager3.isActive();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        double double23 = manager3.getHourlyRate();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = credentials8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        manager4.setActive(false);
        java.lang.String str8 = manager4.getDepartment();
        manager4.setDepartment("");
        com.yorku.lab.model.Credentials credentials11 = null;
        manager4.setCredentials(credentials11);
        java.lang.String str13 = manager4.getUserId();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus7 = null;
        manager3.setStatus(accountStatus7);
        manager3.addEquipment("", "hi!", "");
        com.yorku.lab.model.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        java.lang.String str6 = manager4.getUserId();
        java.lang.String str7 = manager4.getDepartment();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        manager3.setActive(false);
        com.yorku.lab.model.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        com.yorku.lab.enums.AccountStatus accountStatus21 = null;
        manager3.setStatus(accountStatus21);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager4.disableEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("hi!", "", credentials2, "hi!");
        manager4.setUserId("");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("hi!", "", credentials2, "hi!");
        com.yorku.lab.model.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager4.markMaintenance(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        manager4.setActive(false);
        java.lang.String str8 = manager4.getDepartment();
        com.yorku.lab.model.Credentials credentials9 = manager4.getCredentials();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        com.yorku.lab.enums.AccountStatus accountStatus21 = manager3.getStatus();
        java.lang.String str22 = manager3.getFullName();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        manager3.setCredentials(credentials4);
        manager3.setDepartment("hi!");
        java.lang.Class<?> wildcardClass8 = manager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials25 = null;
        manager3.setCredentials(credentials25);
        java.lang.String str27 = manager3.getFullName();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials11 = manager3.getCredentials();
        com.yorku.lab.enums.UserType userType12 = manager3.getType();
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.Manager manager16 = new com.yorku.lab.model.Manager("", "", credentials15);
        manager16.setIdOrCertificationNumber("");
        java.lang.String str19 = manager16.getDepartment();
        manager16.setHourlyRate(0.0d);
        java.lang.String str22 = manager16.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus23 = null;
        manager16.setStatus(accountStatus23);
        com.yorku.lab.model.Credentials credentials27 = null;
        com.yorku.lab.model.Manager manager28 = new com.yorku.lab.model.Manager("", "", credentials27);
        manager28.setIdOrCertificationNumber("");
        manager28.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials33 = manager28.getCredentials();
        com.yorku.lab.model.Credentials credentials36 = null;
        com.yorku.lab.model.Manager manager37 = new com.yorku.lab.model.Manager("", "", credentials36);
        manager37.setIdOrCertificationNumber("");
        manager37.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials42 = manager37.getCredentials();
        java.lang.String str43 = manager37.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType44 = manager37.getAffiliation();
        manager28.setAffiliation(affiliationType44);
        manager28.setActive(true);
        java.lang.String str48 = manager28.getIdOrCertificationNumber();
        manager28.setActive(true);
        com.yorku.lab.model.Credentials credentials53 = null;
        com.yorku.lab.model.Manager manager54 = new com.yorku.lab.model.Manager("", "", credentials53);
        manager54.setIdOrCertificationNumber("");
        manager54.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials59 = manager54.getCredentials();
        com.yorku.lab.model.Credentials credentials62 = null;
        com.yorku.lab.model.Manager manager63 = new com.yorku.lab.model.Manager("", "", credentials62);
        manager63.setIdOrCertificationNumber("");
        manager63.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials68 = manager63.getCredentials();
        java.lang.String str69 = manager63.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType70 = manager63.getAffiliation();
        manager54.setAffiliation(affiliationType70);
        manager28.setAffiliation(affiliationType70);
        manager16.setAffiliation(affiliationType70);
        manager3.setAffiliation(affiliationType70);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType12.equals(com.yorku.lab.enums.UserType.MANAGER));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(credentials33);
        org.junit.Assert.assertNull(credentials42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + affiliationType44 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType44.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(credentials59);
        org.junit.Assert.assertNull(credentials68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + affiliationType70 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType70.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        java.lang.String str25 = manager3.getFullName();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus11 = manager3.getStatus();
        com.yorku.lab.model.Credentials credentials12 = manager3.getCredentials();
        manager3.setFullName("");
        java.lang.String str15 = manager3.getUserId();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertNull(credentials12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        manager3.setStatus(accountStatus10);
        java.lang.String str12 = manager3.getDepartment();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials25 = null;
        manager3.setCredentials(credentials25);
        boolean boolean27 = manager3.isActive();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        manager3.setStatus(accountStatus10);
        java.lang.String str12 = manager3.getIdOrCertificationNumber();
        manager3.addEquipment("hi!", "", "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        java.lang.String str23 = manager3.getUserId();
        com.yorku.lab.model.Credentials credentials26 = null;
        com.yorku.lab.model.Manager manager27 = new com.yorku.lab.model.Manager("", "", credentials26);
        manager27.setIdOrCertificationNumber("");
        manager27.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials32 = manager27.getCredentials();
        com.yorku.lab.model.Credentials credentials35 = null;
        com.yorku.lab.model.Manager manager36 = new com.yorku.lab.model.Manager("", "", credentials35);
        manager36.setIdOrCertificationNumber("");
        manager36.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials41 = manager36.getCredentials();
        java.lang.String str42 = manager36.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType43 = manager36.getAffiliation();
        manager27.setAffiliation(affiliationType43);
        manager3.setAffiliation(affiliationType43);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(credentials32);
        org.junit.Assert.assertNull(credentials41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + affiliationType43 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType43.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        manager3.setActive(false);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        java.lang.String str23 = manager3.getUserId();
        java.lang.String str24 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.addEquipment("", "", "");
        java.lang.String str27 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setDepartment("hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        manager3.setDepartment("");
        com.yorku.lab.enums.UserType userType13 = manager3.getType();
        java.lang.Class<?> wildcardClass14 = manager3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType13.equals(com.yorku.lab.enums.UserType.MANAGER));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus7 = null;
        manager3.setStatus(accountStatus7);
        manager3.addEquipment("", "hi!", "");
        double double13 = manager3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = manager3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        boolean boolean25 = manager3.isActive();
        manager3.setUserId("");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        com.yorku.lab.enums.AffiliationType affiliationType6 = manager4.getAffiliation();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertTrue("'" + affiliationType6 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType6.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setFullName("");
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.addEquipment("", "", "");
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        manager3.setAffiliation(affiliationType11);
        boolean boolean13 = manager3.isActive();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus11 = manager3.getStatus();
        com.yorku.lab.model.Credentials credentials12 = manager3.getCredentials();
        manager3.setFullName("");
        com.yorku.lab.model.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.enums.UserType userType11 = manager3.getType();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType11.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        java.lang.String str5 = manager4.getFullName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.setUserId("hi!");
        manager3.addEquipment("hi!", "", "");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        java.lang.String str8 = manager3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus9 = manager3.getStatus();
        manager3.setUserId("hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType25 = null;
        manager3.setAffiliation(affiliationType25);
        com.yorku.lab.model.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        manager3.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getFullName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        manager3.setHourlyRate((double) (-1L));
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) -1);
        manager3.setUserId("");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        manager3.addEquipment("hi!", "", "");
        com.yorku.lab.model.Credentials credentials30 = manager3.getCredentials();
        com.yorku.lab.model.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(credentials30);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        com.yorku.lab.model.Credentials credentials28 = null;
        com.yorku.lab.model.Manager manager29 = new com.yorku.lab.model.Manager("", "", credentials28);
        manager29.setIdOrCertificationNumber("");
        manager29.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials34 = manager29.getCredentials();
        com.yorku.lab.model.Credentials credentials37 = null;
        com.yorku.lab.model.Manager manager38 = new com.yorku.lab.model.Manager("", "", credentials37);
        manager38.setIdOrCertificationNumber("");
        manager38.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials43 = manager38.getCredentials();
        java.lang.String str44 = manager38.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType45 = manager38.getAffiliation();
        manager29.setAffiliation(affiliationType45);
        manager3.setAffiliation(affiliationType45);
        java.lang.String str48 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(credentials34);
        org.junit.Assert.assertNull(credentials43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + affiliationType45 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType45.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        manager3.setIdOrCertificationNumber("");
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.UserType userType12 = manager3.getType();
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType12.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        com.yorku.lab.model.Credentials credentials26 = null;
        com.yorku.lab.model.Manager manager27 = new com.yorku.lab.model.Manager("", "", credentials26);
        manager27.setIdOrCertificationNumber("");
        manager27.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials32 = manager27.getCredentials();
        java.lang.String str33 = manager27.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType34 = manager27.getAffiliation();
        manager3.setAffiliation(affiliationType34);
        com.yorku.lab.model.Equipment equipment36 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(credentials32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + affiliationType34 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType34.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        manager3.setIdOrCertificationNumber("hi!");
        manager3.setActive(false);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        manager3.setDepartment("");
        boolean boolean13 = manager3.isActive();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("hi!", "hi!", credentials2, "hi!");
        com.yorku.lab.model.Credentials credentials5 = manager4.getCredentials();
        org.junit.Assert.assertNull(credentials5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus10 = manager3.getStatus();
        boolean boolean11 = manager3.isActive();
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        manager4.setActive(false);
        java.lang.String str8 = manager4.getDepartment();
        manager4.setDepartment("");
        com.yorku.lab.model.Credentials credentials11 = null;
        manager4.setCredentials(credentials11);
        com.yorku.lab.enums.AffiliationType affiliationType13 = manager4.getAffiliation();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        com.yorku.lab.enums.AccountStatus accountStatus26 = manager3.getStatus();
        double double27 = manager3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus28 = manager3.getStatus();
        com.yorku.lab.enums.AffiliationType affiliationType29 = manager3.getAffiliation();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(accountStatus26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(accountStatus28);
        org.junit.Assert.assertTrue("'" + affiliationType29 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType29.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        boolean boolean24 = manager3.isActive();
        com.yorku.lab.model.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.addEquipment("", "hi!", "");
        manager3.setIdOrCertificationNumber("hi!");
        java.lang.String str29 = manager3.getIdOrCertificationNumber();
        java.lang.String str30 = manager3.getUserId();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        manager4.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(accountStatus5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        manager3.addEquipment("hi!", "", "");
        java.lang.String str27 = manager3.getUserId();
        boolean boolean28 = manager3.isActive();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        com.yorku.lab.enums.AccountStatus accountStatus21 = manager3.getStatus();
        com.yorku.lab.model.Credentials credentials22 = manager3.getCredentials();
        com.yorku.lab.model.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertNull(credentials22);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.setUserId("hi!");
        java.lang.String str25 = manager3.getDepartment();
        java.lang.String str26 = manager3.getUserId();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        java.lang.String str7 = manager3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        com.yorku.lab.enums.AccountStatus accountStatus26 = manager3.getStatus();
        com.yorku.lab.model.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(accountStatus26);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        com.yorku.lab.enums.AffiliationType affiliationType11 = manager3.getAffiliation();
        double double12 = manager3.getHourlyRate();
        double double13 = manager3.getHourlyRate();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertTrue("'" + affiliationType11 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType11.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        com.yorku.lab.enums.UserType userType24 = manager3.getType();
        com.yorku.lab.enums.UserType userType25 = manager3.getType();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType24 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType24.equals(com.yorku.lab.enums.UserType.MANAGER));
        org.junit.Assert.assertTrue("'" + userType25 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType25.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        java.lang.String str11 = manager3.getUserId();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        manager3.addEquipment("hi!", "", "");
        manager3.setUserId("");
        manager3.setDepartment("hi!");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        com.yorku.lab.enums.UserType userType6 = manager3.getType();
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType6.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        manager3.setUserId("hi!");
        java.lang.String str25 = manager3.getDepartment();
        com.yorku.lab.model.Equipment equipment26 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        java.lang.Class<?> wildcardClass24 = manager3.getClass();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        com.yorku.lab.enums.UserType userType7 = manager3.getType();
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType7.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        manager3.setCredentials(credentials4);
        java.lang.String str6 = manager3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials7 = null;
        manager3.setCredentials(credentials7);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        manager3.setIdOrCertificationNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("hi!", "hi!", credentials2);
        manager3.addEquipment("hi!", "hi!", "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "", credentials2, "");
        manager4.setFullName("");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        com.yorku.lab.model.Credentials credentials23 = null;
        manager3.setCredentials(credentials23);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.addEquipment("hi!", "", "hi!");
        manager3.setIdOrCertificationNumber("");
        manager3.setActive(false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        manager3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType26 = manager3.getType();
        manager3.setHourlyRate((double) (byte) -1);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType26 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType26.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        manager3.setDepartment("");
        com.yorku.lab.model.Credentials credentials13 = manager3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(credentials13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setFullName("");
        java.lang.String str11 = manager3.getDepartment();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        manager3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        manager3.setStatus(accountStatus13);
        java.lang.String str15 = manager3.getIdOrCertificationNumber();
        java.lang.String str16 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        com.yorku.lab.enums.AccountStatus accountStatus26 = manager3.getStatus();
        double double27 = manager3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus28 = manager3.getStatus();
        manager3.setActive(false);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(accountStatus26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(accountStatus28);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setFullName("");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setIdOrCertificationNumber("hi!");
        manager3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus13 = manager3.getStatus();
        com.yorku.lab.enums.UserType userType14 = manager3.getType();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType14.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        manager3.addEquipment("hi!", "", "");
        com.yorku.lab.model.Credentials credentials30 = manager3.getCredentials();
        boolean boolean31 = manager3.isActive();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(credentials30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) -1);
        double double25 = manager3.getHourlyRate();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        manager3.setHourlyRate((double) '#');
        manager3.addEquipment("", "", "");
        com.yorku.lab.model.Equipment equipment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        manager3.setIdOrCertificationNumber("");
        manager3.setHourlyRate(0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getFullName();
        com.yorku.lab.enums.AffiliationType affiliationType7 = null;
        manager3.setAffiliation(affiliationType7);
        com.yorku.lab.model.Credentials credentials9 = null;
        manager3.setCredentials(credentials9);
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.addEquipment("", "", "");
        com.yorku.lab.model.Credentials credentials28 = null;
        manager3.setCredentials(credentials28);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        java.lang.String str6 = manager4.getUserId();
        manager4.setActive(false);
        boolean boolean9 = manager4.isActive();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        java.lang.String str6 = manager4.getUserId();
        manager4.setActive(false);
        manager4.setDepartment("");
        manager4.setUserId("hi!");
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        com.yorku.lab.enums.AccountStatus accountStatus21 = manager3.getStatus();
        com.yorku.lab.model.Credentials credentials22 = manager3.getCredentials();
        manager3.setActive(true);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertNull(credentials22);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        com.yorku.lab.enums.AccountStatus accountStatus21 = manager3.getStatus();
        java.lang.String str22 = manager3.getIdOrCertificationNumber();
        java.lang.String str23 = manager3.getDepartment();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(true);
        java.lang.String str23 = manager3.getIdOrCertificationNumber();
        manager3.setActive(true);
        manager3.addEquipment("hi!", "", "");
        com.yorku.lab.model.Credentials credentials30 = manager3.getCredentials();
        java.lang.String str31 = manager3.getFullName();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(credentials30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        manager3.setStatus(accountStatus10);
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Manager manager15 = new com.yorku.lab.model.Manager("", "", credentials14);
        manager15.setIdOrCertificationNumber("");
        manager15.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials20 = manager15.getCredentials();
        com.yorku.lab.model.Credentials credentials23 = null;
        com.yorku.lab.model.Manager manager24 = new com.yorku.lab.model.Manager("", "", credentials23);
        manager24.setIdOrCertificationNumber("");
        manager24.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials29 = manager24.getCredentials();
        java.lang.String str30 = manager24.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType31 = manager24.getAffiliation();
        manager15.setAffiliation(affiliationType31);
        manager15.setActive(true);
        java.lang.String str35 = manager15.getIdOrCertificationNumber();
        manager15.setActive(true);
        com.yorku.lab.model.Credentials credentials40 = null;
        com.yorku.lab.model.Manager manager41 = new com.yorku.lab.model.Manager("", "", credentials40);
        manager41.setIdOrCertificationNumber("");
        manager41.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials46 = manager41.getCredentials();
        com.yorku.lab.model.Credentials credentials49 = null;
        com.yorku.lab.model.Manager manager50 = new com.yorku.lab.model.Manager("", "", credentials49);
        manager50.setIdOrCertificationNumber("");
        manager50.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials55 = manager50.getCredentials();
        java.lang.String str56 = manager50.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType57 = manager50.getAffiliation();
        manager41.setAffiliation(affiliationType57);
        manager15.setAffiliation(affiliationType57);
        manager3.setAffiliation(affiliationType57);
        manager3.setFullName("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(credentials20);
        org.junit.Assert.assertNull(credentials29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + affiliationType31 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType31.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(credentials46);
        org.junit.Assert.assertNull(credentials55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + affiliationType57 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType57.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("hi!", "hi!", credentials2, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        boolean boolean6 = manager4.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType7 = manager4.getAffiliation();
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + affiliationType7 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType7.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        boolean boolean24 = manager3.isActive();
        manager3.addEquipment("", "", "");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        manager3.setIdOrCertificationNumber("");
        java.lang.String str26 = manager3.getUserId();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("hi!", "hi!", credentials2);
        manager3.setIdOrCertificationNumber("");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        manager3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        manager3.setStatus(accountStatus13);
        java.lang.String str15 = manager3.getIdOrCertificationNumber();
        double double16 = manager3.getHourlyRate();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        manager3.setStatus(accountStatus10);
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Manager manager15 = new com.yorku.lab.model.Manager("", "", credentials14);
        manager15.setIdOrCertificationNumber("");
        manager15.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials20 = manager15.getCredentials();
        com.yorku.lab.model.Credentials credentials23 = null;
        com.yorku.lab.model.Manager manager24 = new com.yorku.lab.model.Manager("", "", credentials23);
        manager24.setIdOrCertificationNumber("");
        manager24.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials29 = manager24.getCredentials();
        java.lang.String str30 = manager24.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType31 = manager24.getAffiliation();
        manager15.setAffiliation(affiliationType31);
        manager15.setActive(true);
        java.lang.String str35 = manager15.getIdOrCertificationNumber();
        manager15.setActive(true);
        com.yorku.lab.model.Credentials credentials40 = null;
        com.yorku.lab.model.Manager manager41 = new com.yorku.lab.model.Manager("", "", credentials40);
        manager41.setIdOrCertificationNumber("");
        manager41.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials46 = manager41.getCredentials();
        com.yorku.lab.model.Credentials credentials49 = null;
        com.yorku.lab.model.Manager manager50 = new com.yorku.lab.model.Manager("", "", credentials49);
        manager50.setIdOrCertificationNumber("");
        manager50.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials55 = manager50.getCredentials();
        java.lang.String str56 = manager50.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType57 = manager50.getAffiliation();
        manager41.setAffiliation(affiliationType57);
        manager15.setAffiliation(affiliationType57);
        manager3.setAffiliation(affiliationType57);
        java.lang.String str61 = manager3.getUserId();
        manager3.setDepartment("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(credentials20);
        org.junit.Assert.assertNull(credentials29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + affiliationType31 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType31.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(credentials46);
        org.junit.Assert.assertNull(credentials55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + affiliationType57 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType57.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setDepartment("");
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        com.yorku.lab.enums.UserType userType24 = manager3.getType();
        com.yorku.lab.enums.AccountStatus accountStatus25 = null;
        manager3.setStatus(accountStatus25);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType24 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType24.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        boolean boolean10 = manager3.isActive();
        manager3.setActive(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        java.lang.String str6 = manager3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus7 = null;
        manager3.setStatus(accountStatus7);
        com.yorku.lab.model.Credentials credentials9 = manager3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        manager3.setIdOrCertificationNumber("");
        manager3.setDepartment("");
        manager3.setUserId("");
        com.yorku.lab.enums.AccountStatus accountStatus30 = manager3.getStatus();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus30);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        com.yorku.lab.enums.AccountStatus accountStatus5 = manager4.getStatus();
        manager4.setActive(false);
        java.lang.String str8 = manager4.getDepartment();
        manager4.setDepartment("");
        manager4.setActive(false);
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        manager4.setAffiliation(affiliationType13);
        org.junit.Assert.assertNull(accountStatus5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        com.yorku.lab.enums.AffiliationType affiliationType23 = manager3.getAffiliation();
        manager3.setIdOrCertificationNumber("");
        manager3.setDepartment("");
        com.yorku.lab.enums.UserType userType28 = manager3.getType();
        com.yorku.lab.enums.UserType userType29 = manager3.getType();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType23 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType23.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType28 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType28.equals(com.yorku.lab.enums.UserType.MANAGER));
        org.junit.Assert.assertTrue("'" + userType29 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType29.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("");
        manager3.setActive(false);
        java.lang.Class<?> wildcardClass13 = manager3.getClass();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "hi!", credentials2);
        manager3.setHourlyRate(0.0d);
        manager3.setIdOrCertificationNumber("");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getUserId();
        com.yorku.lab.enums.UserType userType10 = manager3.getType();
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType13 = manager3.getAffiliation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType10.equals(com.yorku.lab.enums.UserType.MANAGER));
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.addEquipment("", "hi!", "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        double double24 = manager3.getHourlyRate();
        manager3.setDepartment("hi!");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials11 = manager3.getCredentials();
        com.yorku.lab.enums.UserType userType12 = manager3.getType();
        manager3.setUserId("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType12.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getUserId();
        manager3.setActive(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        java.lang.String str9 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        manager3.addEquipment("", "", "hi!");
        manager3.setDepartment("");
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        manager3.setActive(false);
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials25 = null;
        manager3.setCredentials(credentials25);
        com.yorku.lab.enums.AffiliationType affiliationType27 = manager3.getAffiliation();
        manager3.setUserId("hi!");
        com.yorku.lab.model.Equipment equipment30 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType27 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType27.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("hi!", "", credentials2);
        manager3.setUserId("");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Manager manager12 = new com.yorku.lab.model.Manager("", "", credentials11);
        manager12.setIdOrCertificationNumber("");
        manager12.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials17 = manager12.getCredentials();
        java.lang.String str18 = manager12.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType19 = manager12.getAffiliation();
        manager3.setAffiliation(affiliationType19);
        java.lang.String str21 = manager3.getFullName();
        boolean boolean22 = manager3.isActive();
        boolean boolean23 = manager3.isActive();
        com.yorku.lab.model.Credentials credentials24 = manager3.getCredentials();
        com.yorku.lab.enums.UserType userType25 = manager3.getType();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + affiliationType19 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType19.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(credentials24);
        org.junit.Assert.assertTrue("'" + userType25 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType25.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setHourlyRate(0.0d);
        java.lang.String str9 = manager3.getDepartment();
        double double10 = manager3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials11 = manager3.getCredentials();
        com.yorku.lab.enums.UserType userType12 = manager3.getType();
        boolean boolean13 = manager3.isActive();
        manager3.setDepartment("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType12.equals(com.yorku.lab.enums.UserType.MANAGER));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }
}

