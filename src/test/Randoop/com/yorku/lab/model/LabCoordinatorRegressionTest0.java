package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LabCoordinatorRegressionTest0 {

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
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        java.lang.Class<?> wildcardClass4 = labCoordinator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        org.junit.Assert.assertNull(affiliationType8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials8 = labCoordinator3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.model.Credentials credentials13 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials13);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setFullName("");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setUserId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType12 = null;
        labCoordinator3.setAffiliation(affiliationType12);
        java.lang.String str14 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        double double12 = labCoordinator3.getHourlyRate();
        java.lang.String str13 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials6 = labCoordinator3.getCredentials();
        org.junit.Assert.assertNull(credentials6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) (byte) 100);
        labCoordinator3.setUserId("hi!");
        double double11 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        java.lang.String str12 = labCoordinator3.getUserId();
        double double13 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) (byte) 100);
        double double9 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.UserType userType10 = labCoordinator3.getType();
        java.lang.Class<?> wildcardClass11 = userType10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType10.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.Class<?> wildcardClass13 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        double double9 = labCoordinator3.getHourlyRate();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType12 = labCoordinator3.getType();
        labCoordinator3.setFullName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType12.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) ' ');
        labCoordinator3.setHourlyRate((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.String str4 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) (byte) 100);
        labCoordinator3.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        java.lang.String str8 = labCoordinator3.getFullName();
        java.lang.String str9 = labCoordinator3.getFullName();
        double double10 = labCoordinator3.getHourlyRate();
        labCoordinator3.setUserId("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        java.lang.Class<?> wildcardClass8 = labCoordinator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        java.lang.Class<?> wildcardClass14 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus11 = labCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "hi!", credentials2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        double double12 = labCoordinator3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials13 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(credentials13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getIdOrCertificationNumber();
        java.lang.String str14 = labCoordinator3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        labCoordinator3.setIdOrCertificationNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) (byte) 100);
        double double9 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.UserType userType10 = labCoordinator3.getType();
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setHourlyRate((double) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType10.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        double double9 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType14 = labCoordinator3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus15 = null;
        labCoordinator3.setStatus(accountStatus15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(affiliationType14);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        double double12 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.Class<?> wildcardClass4 = labCoordinator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.UserType userType14 = labCoordinator3.getType();
        com.yorku.lab.model.Credentials credentials17 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator18 = new com.yorku.lab.model.LabCoordinator("", "", credentials17);
        labCoordinator18.setUserId("hi!");
        java.lang.String str21 = labCoordinator18.getFullName();
        labCoordinator18.setIdOrCertificationNumber("");
        double double24 = labCoordinator18.getHourlyRate();
        labCoordinator18.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials29 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator30 = new com.yorku.lab.model.LabCoordinator("", "", credentials29);
        labCoordinator30.setUserId("hi!");
        java.lang.String str33 = labCoordinator30.getFullName();
        labCoordinator30.setIdOrCertificationNumber("");
        double double36 = labCoordinator30.getHourlyRate();
        labCoordinator30.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType39 = labCoordinator30.getAffiliation();
        labCoordinator18.setAffiliation(affiliationType39);
        labCoordinator3.setAffiliation(affiliationType39);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType14.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType39 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType39.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType12 = null;
        labCoordinator3.setAffiliation(affiliationType12);
        com.yorku.lab.model.Credentials credentials16 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator17 = new com.yorku.lab.model.LabCoordinator("", "", credentials16);
        labCoordinator17.setUserId("hi!");
        java.lang.String str20 = labCoordinator17.getFullName();
        labCoordinator17.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials23 = null;
        labCoordinator17.setCredentials(credentials23);
        java.lang.String str25 = labCoordinator17.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus26 = labCoordinator17.getStatus();
        com.yorku.lab.model.Credentials credentials29 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator30 = new com.yorku.lab.model.LabCoordinator("", "", credentials29);
        labCoordinator30.setUserId("hi!");
        java.lang.String str33 = labCoordinator30.getFullName();
        labCoordinator30.setIdOrCertificationNumber("");
        double double36 = labCoordinator30.getHourlyRate();
        labCoordinator30.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials41 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator42 = new com.yorku.lab.model.LabCoordinator("", "", credentials41);
        labCoordinator42.setUserId("hi!");
        java.lang.String str45 = labCoordinator42.getFullName();
        labCoordinator42.setIdOrCertificationNumber("");
        double double48 = labCoordinator42.getHourlyRate();
        labCoordinator42.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType51 = labCoordinator42.getAffiliation();
        labCoordinator30.setAffiliation(affiliationType51);
        labCoordinator17.setAffiliation(affiliationType51);
        labCoordinator3.setAffiliation(affiliationType51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(accountStatus26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType51 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType51.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        java.lang.String str8 = labCoordinator3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = labCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        java.lang.String str12 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        java.lang.String str12 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        double double9 = labCoordinator3.getHourlyRate();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType12 = labCoordinator3.getAffiliation();
        labCoordinator3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType12 = null;
        labCoordinator3.setAffiliation(affiliationType12);
        java.lang.Class<?> wildcardClass14 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials15 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        labCoordinator3.setHourlyRate((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getUserId();
        labCoordinator3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType16 = null;
        labCoordinator3.setAffiliation(affiliationType16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        double double4 = labCoordinator3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials7 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator8 = new com.yorku.lab.model.LabCoordinator("", "", credentials7);
        labCoordinator8.setUserId("hi!");
        java.lang.String str11 = labCoordinator8.getFullName();
        labCoordinator8.setIdOrCertificationNumber("");
        double double14 = labCoordinator8.getHourlyRate();
        labCoordinator8.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials19 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator20 = new com.yorku.lab.model.LabCoordinator("", "", credentials19);
        labCoordinator20.setUserId("hi!");
        java.lang.String str23 = labCoordinator20.getFullName();
        labCoordinator20.setIdOrCertificationNumber("");
        double double26 = labCoordinator20.getHourlyRate();
        labCoordinator20.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType29 = labCoordinator20.getAffiliation();
        labCoordinator8.setAffiliation(affiliationType29);
        labCoordinator3.setAffiliation(affiliationType29);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType29 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType29.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        double double9 = labCoordinator3.getHourlyRate();
        labCoordinator3.setActive(true);
        labCoordinator3.setHourlyRate(0.0d);
        labCoordinator3.setUserId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = null;
        labCoordinator3.setCredentials(credentials11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        com.yorku.lab.enums.AccountStatus accountStatus11 = labCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) (byte) 100);
        double double9 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.UserType userType10 = labCoordinator3.getType();
        java.lang.String str11 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType10.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus12 = labCoordinator3.getStatus();
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator16 = new com.yorku.lab.model.LabCoordinator("", "", credentials15);
        labCoordinator16.setUserId("hi!");
        java.lang.String str19 = labCoordinator16.getFullName();
        labCoordinator16.setIdOrCertificationNumber("");
        double double22 = labCoordinator16.getHourlyRate();
        labCoordinator16.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials27 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator28 = new com.yorku.lab.model.LabCoordinator("", "", credentials27);
        labCoordinator28.setUserId("hi!");
        java.lang.String str31 = labCoordinator28.getFullName();
        labCoordinator28.setIdOrCertificationNumber("");
        double double34 = labCoordinator28.getHourlyRate();
        labCoordinator28.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType37 = labCoordinator28.getAffiliation();
        labCoordinator16.setAffiliation(affiliationType37);
        labCoordinator3.setAffiliation(affiliationType37);
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(accountStatus12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType37 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType37.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        double double6 = labCoordinator3.getHourlyRate();
        java.lang.String str7 = labCoordinator3.getFullName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.UserType userType14 = labCoordinator3.getType();
        labCoordinator3.setIdOrCertificationNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType14.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        java.lang.String str8 = labCoordinator3.getFullName();
        labCoordinator3.setActive(true);
        com.yorku.lab.model.Credentials credentials11 = null;
        labCoordinator3.setCredentials(credentials11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        java.lang.String str11 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType12 = null;
        labCoordinator3.setAffiliation(affiliationType12);
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("hi!");
        labCoordinator3.setFullName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setActive(false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) ' ');
        java.lang.Class<?> wildcardClass16 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials13 = null;
        labCoordinator3.setCredentials(credentials13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        java.lang.String str8 = labCoordinator3.getFullName();
        java.lang.String str9 = labCoordinator3.getFullName();
        boolean boolean10 = labCoordinator3.isActive();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        double double9 = labCoordinator3.getHourlyRate();
        labCoordinator3.setHourlyRate(0.0d);
        labCoordinator3.setHourlyRate((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("hi!");
        java.lang.String str15 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        java.lang.String str12 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        labCoordinator3.setStatus(accountStatus13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setFullName("");
        java.lang.Class<?> wildcardClass13 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        double double6 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus7 = labCoordinator3.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(accountStatus7);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setFullName("");
        com.yorku.lab.model.Credentials credentials13 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials13);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        java.lang.String str4 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus5 = null;
        labCoordinator3.setStatus(accountStatus5);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getUserId();
        labCoordinator3.setHourlyRate((double) (byte) 100);
        labCoordinator3.setUserId("hi!");
        java.lang.String str11 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        java.lang.String str13 = labCoordinator3.getUserId();
        labCoordinator3.setActive(false);
        com.yorku.lab.model.Credentials credentials16 = null;
        labCoordinator3.setCredentials(credentials16);
        com.yorku.lab.model.Credentials credentials18 = null;
        labCoordinator3.setCredentials(credentials18);
        com.yorku.lab.model.Credentials credentials20 = null;
        labCoordinator3.setCredentials(credentials20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        labCoordinator3.setHourlyRate((double) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

