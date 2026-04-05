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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.Class<?> wildcardClass4 = manager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("hi!");
        boolean boolean11 = manager3.isActive();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus7 = manager3.getStatus();
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.Manager manager11 = new com.yorku.lab.model.Manager("", "", credentials10);
        manager11.setIdOrCertificationNumber("");
        java.lang.String str14 = manager11.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType15 = manager11.getAffiliation();
        manager3.setAffiliation(affiliationType15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + affiliationType15 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType15.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setActive(true);
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        boolean boolean6 = manager3.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("hi!", "", credentials2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getDepartment();
        manager3.setFullName("");
        manager3.setActive(true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        boolean boolean4 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) 0);
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.enableEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setActive(true);
        com.yorku.lab.model.Credentials credentials9 = manager3.getCredentials();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        manager4.addEquipment("", "hi!", "hi!");
        com.yorku.lab.enums.AffiliationType affiliationType9 = null;
        manager4.setAffiliation(affiliationType9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        java.lang.String str7 = manager3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getDepartment();
        manager3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus7 = manager3.getStatus();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(accountStatus7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType7 = manager3.getAffiliation();
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + affiliationType7 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType7.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus11 = manager3.getStatus();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setIdOrCertificationNumber("");
        java.lang.Class<?> wildcardClass9 = manager3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus7 = manager3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus8 = manager3.getStatus();
        double double9 = manager3.getHourlyRate();
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setActive(false);
        com.yorku.lab.model.Credentials credentials8 = null;
        manager3.setCredentials(credentials8);
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        manager3.setStatus(accountStatus10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setDepartment("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        manager4.addEquipment("", "hi!", "hi!");
        boolean boolean9 = manager4.isActive();
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager4.enableEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("hi!");
        com.yorku.lab.enums.UserType userType11 = manager3.getType();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType11.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        java.lang.String str8 = manager3.getFullName();
        manager3.addEquipment("", "", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus6 = null;
        manager3.setStatus(accountStatus6);
        com.yorku.lab.enums.UserType userType8 = manager3.getType();
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType8.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus7 = manager3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus8 = manager3.getStatus();
        double double9 = manager3.getHourlyRate();
        com.yorku.lab.enums.UserType userType10 = manager3.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType10.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Credentials credentials8 = null;
        com.yorku.lab.model.Manager manager9 = new com.yorku.lab.model.Manager("", "", credentials8);
        manager9.setIdOrCertificationNumber("");
        manager9.setUserId("hi!");
        java.lang.String str14 = manager9.getFullName();
        com.yorku.lab.enums.AffiliationType affiliationType15 = manager9.getAffiliation();
        manager3.setAffiliation(affiliationType15);
        com.yorku.lab.model.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.markMaintenance(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + affiliationType15 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType15.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = manager3.getAffiliation();
        java.lang.String str5 = manager3.getUserId();
        org.junit.Assert.assertTrue("'" + affiliationType4 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType4.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "hi!", credentials2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        boolean boolean4 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) 0);
        java.lang.String str7 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.enums.AccountStatus accountStatus9 = manager3.getStatus();
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        com.yorku.lab.enums.AffiliationType affiliationType11 = manager3.getAffiliation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType11 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType11.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.model.Credentials credentials9 = manager3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus7 = manager3.getStatus();
        manager3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        double double6 = manager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        boolean boolean4 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) 0);
        java.lang.String str7 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        boolean boolean4 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) 0);
        java.lang.String str7 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.enums.AccountStatus accountStatus9 = manager3.getStatus();
        java.lang.String str10 = manager3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        manager3.setStatus(accountStatus11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials7 = null;
        com.yorku.lab.model.Manager manager8 = new com.yorku.lab.model.Manager("", "", credentials7);
        manager8.setIdOrCertificationNumber("");
        java.lang.String str11 = manager8.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType12 = manager8.getAffiliation();
        manager3.setAffiliation(affiliationType12);
        manager3.setHourlyRate((double) (-1.0f));
        com.yorku.lab.enums.UserType userType16 = manager3.getType();
        manager3.setDepartment("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType16 + "' != '" + com.yorku.lab.enums.UserType.MANAGER + "'", userType16.equals(com.yorku.lab.enums.UserType.MANAGER));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "", credentials2, "hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        java.lang.String str7 = manager3.getFullName();
        com.yorku.lab.model.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        boolean boolean4 = manager3.isActive();
        manager3.setHourlyRate((double) (byte) 0);
        java.lang.String str7 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        com.yorku.lab.enums.AccountStatus accountStatus9 = manager3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        manager3.setStatus(accountStatus10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setActive(true);
        java.lang.String str9 = manager3.getDepartment();
        manager3.setFullName("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        manager3.setActive(false);
        com.yorku.lab.model.Credentials credentials8 = null;
        manager3.setCredentials(credentials8);
        com.yorku.lab.model.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        manager3.setAffiliation(affiliationType4);
        double double6 = manager3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        manager3.setHourlyRate((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        boolean boolean4 = manager3.isActive();
        manager3.setDepartment("hi!");
        manager3.addEquipment("", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setUserId("hi!");
        manager3.addEquipment("hi!", "", "hi!");
        manager3.setFullName("");
        com.yorku.lab.model.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        manager3.setDepartment("hi!");
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = manager3.getCredentials();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        java.lang.String str7 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials8 = manager3.getCredentials();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType7 = manager3.getAffiliation();
        double double8 = manager3.getHourlyRate();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + affiliationType7 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType7.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setActive(true);
        java.lang.String str9 = manager3.getDepartment();
        manager3.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "", credentials2, "");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getIdOrCertificationNumber();
        boolean boolean7 = manager3.isActive();
        manager3.addEquipment("", "", "hi!");
        java.lang.String str12 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        com.yorku.lab.model.Credentials credentials6 = manager3.getCredentials();
        java.lang.String str7 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = manager3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus5 = null;
        manager3.setStatus(accountStatus5);
        com.yorku.lab.model.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + affiliationType4 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType4.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus7 = manager3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus8 = manager3.getStatus();
        manager3.setUserId("");
        com.yorku.lab.model.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus7);
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        manager3.setUserId("hi!");
        java.lang.String str8 = manager3.getFullName();
        com.yorku.lab.enums.AffiliationType affiliationType9 = manager3.getAffiliation();
        manager3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType12 = manager3.getAffiliation();
        manager3.setDepartment("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + affiliationType9 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType9.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        manager3.setStatus(accountStatus4);
        java.lang.String str6 = manager3.getIdOrCertificationNumber();
        java.lang.String str7 = manager3.getIdOrCertificationNumber();
        boolean boolean8 = manager3.isActive();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials7 = null;
        com.yorku.lab.model.Manager manager8 = new com.yorku.lab.model.Manager("", "", credentials7);
        manager8.setIdOrCertificationNumber("");
        java.lang.String str11 = manager8.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType12 = manager8.getAffiliation();
        manager3.setAffiliation(affiliationType12);
        manager3.setHourlyRate((double) (-1.0f));
        com.yorku.lab.model.Credentials credentials16 = manager3.getCredentials();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(credentials16);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        java.lang.String str6 = manager3.getDepartment();
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus9 = manager3.getStatus();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        com.yorku.lab.model.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager3.disableEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Equipment.setOperationalStatus(com.yorku.lab.enums.OperationalStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        java.lang.String str4 = manager3.getDepartment();
        com.yorku.lab.model.Credentials credentials7 = null;
        com.yorku.lab.model.Manager manager8 = new com.yorku.lab.model.Manager("", "", credentials7);
        manager8.setIdOrCertificationNumber("");
        java.lang.String str11 = manager8.getDepartment();
        com.yorku.lab.enums.AffiliationType affiliationType12 = manager8.getAffiliation();
        manager3.setAffiliation(affiliationType12);
        java.lang.String str14 = manager3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus15 = manager3.getStatus();
        java.lang.String str16 = manager3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(accountStatus15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("", "hi!", credentials2, "");
        manager4.addEquipment("", "hi!", "hi!");
        boolean boolean9 = manager4.isActive();
        manager4.setActive(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager3 = new com.yorku.lab.model.Manager("", "", credentials2);
        manager3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus6 = null;
        manager3.setStatus(accountStatus6);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        manager3.setStatus(accountStatus8);
        com.yorku.lab.enums.AffiliationType affiliationType10 = manager3.getAffiliation();
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Manager manager4 = new com.yorku.lab.model.Manager("hi!", "hi!", credentials2, "");
    }
}

