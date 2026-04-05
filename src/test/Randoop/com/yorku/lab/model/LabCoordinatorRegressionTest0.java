package test.Randoop.com.yorku.lab.model;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        java.lang.Class<?> wildcardClass4 = labCoordinator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.Class<?> wildcardClass15 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        java.lang.String str10 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.UserType userType11 = labCoordinator3.getType();
        java.lang.Class<?> wildcardClass12 = userType11.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType11.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        java.lang.Class<?> wildcardClass10 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        java.lang.String str7 = labCoordinator3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        java.lang.String str9 = labCoordinator3.getFullName();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        java.lang.Class<?> wildcardClass8 = labCoordinator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setFullName("");
        java.lang.Class<?> wildcardClass18 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = labCoordinator3.getStatus();
        org.junit.Assert.assertNull(accountStatus4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        double double7 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        labCoordinator3.setStatus(accountStatus12);
        java.lang.Class<?> wildcardClass14 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        java.lang.String str10 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.UserType userType11 = labCoordinator3.getType();
        double double12 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType11.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        java.lang.String str10 = labCoordinator3.getFullName();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        labCoordinator3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.Class<?> wildcardClass4 = labCoordinator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setHourlyRate((double) (byte) -1);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.enums.UserType userType7 = labCoordinator3.getType();
        java.lang.String str8 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType7.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.String str4 = labCoordinator3.getUserId();
        labCoordinator3.setIdOrCertificationNumber("");
        double double7 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.String str4 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        labCoordinator3.setHourlyRate(0.0d);
        org.junit.Assert.assertNull(affiliationType8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.UserType userType11 = labCoordinator3.getType();
        labCoordinator3.setFullName("");
        com.yorku.lab.model.Credentials credentials14 = null;
        labCoordinator3.setCredentials(credentials14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType11.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setActive(false);
        java.lang.Class<?> wildcardClass9 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.String str4 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials5 = null;
        labCoordinator3.setCredentials(credentials5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        double double10 = labCoordinator3.getHourlyRate();
        labCoordinator3.setActive(true);
        labCoordinator3.setFullName("hi!");
        com.yorku.lab.enums.UserType userType15 = labCoordinator3.getType();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType15 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType15.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        labCoordinator3.setHourlyRate(1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        double double13 = labCoordinator3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus9 = labCoordinator3.getStatus();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        double double4 = labCoordinator3.getHourlyRate();
        java.lang.String str5 = labCoordinator3.getUserId();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        double double10 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        labCoordinator3.setStatus(accountStatus11);
        com.yorku.lab.model.Credentials credentials13 = null;
        labCoordinator3.setCredentials(credentials13);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setHourlyRate((double) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials17 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(credentials17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.String str4 = labCoordinator3.getUserId();
        double double5 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        labCoordinator3.setUserId("hi!");
        org.junit.Assert.assertNull(affiliationType8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        labCoordinator3.setAffiliation(affiliationType13);
        boolean boolean15 = labCoordinator3.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        double double10 = labCoordinator3.getHourlyRate();
        labCoordinator3.setActive(true);
        labCoordinator3.setFullName("hi!");
        java.lang.String str15 = labCoordinator3.getUserId();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        labCoordinator3.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        double double4 = labCoordinator3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = labCoordinator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator11 = new com.yorku.lab.model.LabCoordinator("", "", credentials10);
        labCoordinator11.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator11.getStatus();
        labCoordinator11.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials17 = labCoordinator11.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType18 = labCoordinator11.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType18);
        com.yorku.lab.model.Credentials credentials20 = null;
        labCoordinator3.setCredentials(credentials20);
        com.yorku.lab.enums.AffiliationType affiliationType22 = null;
        labCoordinator3.setAffiliation(affiliationType22);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertTrue("'" + affiliationType18 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType18.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setActive(false);
        java.lang.String str9 = labCoordinator3.getFullName();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator13 = new com.yorku.lab.model.LabCoordinator("", "", credentials12);
        labCoordinator13.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus16 = labCoordinator13.getStatus();
        java.lang.String str17 = labCoordinator13.getUserId();
        labCoordinator13.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType20 = labCoordinator13.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType20);
        java.lang.String str22 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType20 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType20.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "hi!", credentials2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType16 = labCoordinator3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus7 = labCoordinator3.getStatus();
        java.lang.String str8 = labCoordinator3.getFullName();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(accountStatus7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        java.lang.Class<?> wildcardClass9 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(affiliationType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        java.lang.String str10 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        labCoordinator3.setHourlyRate((double) (short) 0);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(credentials11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator11 = new com.yorku.lab.model.LabCoordinator("", "", credentials10);
        labCoordinator11.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator11.getStatus();
        labCoordinator11.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials17 = labCoordinator11.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType18 = labCoordinator11.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType18);
        labCoordinator3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertTrue("'" + affiliationType18 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType18.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        java.lang.String str13 = labCoordinator3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(accountStatus14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator13 = new com.yorku.lab.model.LabCoordinator("", "", credentials12);
        labCoordinator13.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus16 = labCoordinator13.getStatus();
        java.lang.String str17 = labCoordinator13.getUserId();
        labCoordinator13.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType20 = labCoordinator13.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType20);
        com.yorku.lab.enums.AffiliationType affiliationType22 = labCoordinator3.getAffiliation();
        java.lang.Class<?> wildcardClass23 = affiliationType22.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType20 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType20.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType22 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType22.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.enums.UserType userType7 = labCoordinator3.getType();
        labCoordinator3.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType7.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        java.lang.Class<?> wildcardClass9 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        labCoordinator3.setUserId("hi!");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        java.lang.String str10 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        java.lang.String str12 = labCoordinator3.getFullName();
        labCoordinator3.setHourlyRate((double) (-1));
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        labCoordinator3.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        labCoordinator3.setUserId("");
        java.lang.String str17 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials18 = null;
        labCoordinator3.setCredentials(credentials18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials8 = null;
        labCoordinator3.setCredentials(credentials8);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        java.lang.String str4 = labCoordinator3.getUserId();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType7 = labCoordinator3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType7 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType7.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        labCoordinator3.setIdOrCertificationNumber("hi!");
        double double11 = labCoordinator3.getHourlyRate();
        java.lang.String str12 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setIdOrCertificationNumber("hi!");
        java.lang.Class<?> wildcardClass15 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials17 = null;
        labCoordinator3.setCredentials(credentials17);
        com.yorku.lab.enums.AccountStatus accountStatus19 = labCoordinator3.getStatus();
        com.yorku.lab.model.Credentials credentials20 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertNull(credentials20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        labCoordinator3.setStatus(accountStatus12);
        com.yorku.lab.model.Credentials credentials14 = null;
        labCoordinator3.setCredentials(credentials14);
        java.lang.Class<?> wildcardClass16 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "hi!", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = labCoordinator3.getStatus();
        org.junit.Assert.assertNull(accountStatus4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        java.lang.String str10 = labCoordinator3.getIdOrCertificationNumber();
        labCoordinator3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus13 = labCoordinator3.getStatus();
        java.lang.String str14 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials13 = labCoordinator3.getCredentials();
        com.yorku.lab.model.Credentials credentials14 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials13);
        org.junit.Assert.assertNull(credentials14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        double double4 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus5 = null;
        labCoordinator3.setStatus(accountStatus5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getIdOrCertificationNumber();
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus18 = null;
        labCoordinator3.setStatus(accountStatus18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        labCoordinator3.setFullName("hi!");
        com.yorku.lab.enums.UserType userType17 = labCoordinator3.getType();
        labCoordinator3.setHourlyRate((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType17.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        labCoordinator3.setFullName("hi!");
        com.yorku.lab.enums.UserType userType17 = labCoordinator3.getType();
        labCoordinator3.setUserId("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType17.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        labCoordinator3.setIdOrCertificationNumber("hi!");
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setFullName("hi!");
        labCoordinator3.setUserId("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials6 = labCoordinator3.getCredentials();
        labCoordinator3.setUserId("");
        labCoordinator3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus11 = labCoordinator3.getStatus();
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setActive(true);
        com.yorku.lab.enums.UserType userType6 = labCoordinator3.getType();
        double double7 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType6.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        labCoordinator3.setHourlyRate((double) ' ');
        double double16 = labCoordinator3.getHourlyRate();
        labCoordinator3.setFullName("");
        com.yorku.lab.model.Credentials credentials19 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertNull(credentials19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials11 = null;
        labCoordinator3.setCredentials(credentials11);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        labCoordinator3.setStatus(accountStatus13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        labCoordinator3.setFullName("hi!");
        com.yorku.lab.enums.UserType userType17 = labCoordinator3.getType();
        labCoordinator3.setUserId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType17.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        java.lang.String str16 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        labCoordinator3.setStatus(accountStatus16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus18 = labCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(accountStatus18);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus15 = labCoordinator3.getStatus();
        boolean boolean16 = labCoordinator3.isActive();
        java.lang.String str17 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(accountStatus15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType9 = null;
        labCoordinator3.setAffiliation(affiliationType9);
        double double11 = labCoordinator3.getHourlyRate();
        boolean boolean12 = labCoordinator3.isActive();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.model.Credentials credentials19 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator20 = new com.yorku.lab.model.LabCoordinator("", "", credentials19);
        labCoordinator20.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus23 = labCoordinator20.getStatus();
        labCoordinator20.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials26 = labCoordinator20.getCredentials();
        com.yorku.lab.model.Credentials credentials29 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator30 = new com.yorku.lab.model.LabCoordinator("", "", credentials29);
        labCoordinator30.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus33 = labCoordinator30.getStatus();
        java.lang.String str34 = labCoordinator30.getUserId();
        labCoordinator30.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType37 = labCoordinator30.getAffiliation();
        labCoordinator20.setAffiliation(affiliationType37);
        com.yorku.lab.enums.AffiliationType affiliationType39 = labCoordinator20.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType39);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(accountStatus23);
        org.junit.Assert.assertNull(credentials26);
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType37 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType37.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType39 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType39.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        labCoordinator3.setFullName("");
        java.lang.String str14 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        double double4 = labCoordinator3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials7 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator8 = new com.yorku.lab.model.LabCoordinator("", "", credentials7);
        labCoordinator8.setUserId("hi!");
        java.lang.String str11 = labCoordinator8.getFullName();
        labCoordinator8.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials14 = null;
        labCoordinator8.setCredentials(credentials14);
        labCoordinator8.setUserId("");
        labCoordinator8.setUserId("");
        java.lang.String str20 = labCoordinator8.getFullName();
        labCoordinator8.setFullName("");
        labCoordinator8.setHourlyRate((double) 100L);
        com.yorku.lab.model.Credentials credentials27 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator28 = new com.yorku.lab.model.LabCoordinator("", "", credentials27);
        labCoordinator28.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus31 = labCoordinator28.getStatus();
        java.lang.String str32 = labCoordinator28.getUserId();
        labCoordinator28.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType35 = labCoordinator28.getAffiliation();
        labCoordinator8.setAffiliation(affiliationType35);
        labCoordinator3.setAffiliation(affiliationType35);
        com.yorku.lab.enums.AccountStatus accountStatus38 = labCoordinator3.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(accountStatus31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType35 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType35.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(accountStatus38);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "hi!", credentials2);
        java.lang.String str4 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setHourlyRate((double) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        com.yorku.lab.model.Credentials credentials6 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator7 = new com.yorku.lab.model.LabCoordinator("", "", credentials6);
        labCoordinator7.setUserId("hi!");
        java.lang.String str10 = labCoordinator7.getFullName();
        labCoordinator7.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials13 = null;
        labCoordinator7.setCredentials(credentials13);
        labCoordinator7.setUserId("");
        labCoordinator7.setUserId("");
        java.lang.String str19 = labCoordinator7.getFullName();
        labCoordinator7.setFullName("");
        labCoordinator7.setHourlyRate((double) 100L);
        com.yorku.lab.model.Credentials credentials26 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator27 = new com.yorku.lab.model.LabCoordinator("", "", credentials26);
        labCoordinator27.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus30 = labCoordinator27.getStatus();
        java.lang.String str31 = labCoordinator27.getUserId();
        labCoordinator27.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType34 = labCoordinator27.getAffiliation();
        labCoordinator7.setAffiliation(affiliationType34);
        labCoordinator3.setAffiliation(affiliationType34);
        boolean boolean37 = labCoordinator3.isActive();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(accountStatus30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType34 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType34.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        labCoordinator3.setFullName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        labCoordinator3.setAffiliation(affiliationType4);
        com.yorku.lab.enums.UserType userType6 = labCoordinator3.getType();
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType6.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        labCoordinator3.setIdOrCertificationNumber("hi!");
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials15 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus15 = labCoordinator3.getStatus();
        labCoordinator3.setFullName("");
        labCoordinator3.setUserId("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(accountStatus15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        java.lang.String str10 = labCoordinator3.getIdOrCertificationNumber();
        labCoordinator3.setFullName("");
        labCoordinator3.setHourlyRate(0.0d);
        labCoordinator3.setFullName("");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setActive(true);
        com.yorku.lab.model.Credentials credentials6 = null;
        labCoordinator3.setCredentials(credentials6);
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        com.yorku.lab.enums.UserType userType9 = labCoordinator3.getType();
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType9 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType9.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        java.lang.String str8 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType10 = labCoordinator3.getAffiliation();
        labCoordinator3.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType9 = null;
        labCoordinator3.setAffiliation(affiliationType9);
        double double11 = labCoordinator3.getHourlyRate();
        boolean boolean12 = labCoordinator3.isActive();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(true);
        boolean boolean17 = labCoordinator3.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType18 = labCoordinator3.getAffiliation();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(affiliationType18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials16 = labCoordinator3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(credentials16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        double double10 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.model.Credentials credentials13 = null;
        labCoordinator3.setCredentials(credentials13);
        labCoordinator3.setActive(true);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setFullName("");
        labCoordinator3.setHourlyRate((double) 100L);
        labCoordinator3.setIdOrCertificationNumber("");
        java.lang.String str22 = labCoordinator3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        labCoordinator3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Credentials credentials6 = null;
        labCoordinator3.setCredentials(credentials6);
        labCoordinator3.setUserId("hi!");
        labCoordinator3.setFullName("hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        labCoordinator3.setFullName("");
        labCoordinator3.setHourlyRate((double) 0);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setUserId("");
        com.yorku.lab.enums.UserType userType10 = labCoordinator3.getType();
        java.lang.String str11 = labCoordinator3.getUserId();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType10.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setActive(true);
        com.yorku.lab.enums.UserType userType6 = labCoordinator3.getType();
        com.yorku.lab.model.Credentials credentials7 = labCoordinator3.getCredentials();
        labCoordinator3.setHourlyRate((double) (short) 0);
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType6.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertNull(credentials7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator11 = new com.yorku.lab.model.LabCoordinator("", "", credentials10);
        labCoordinator11.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator11.getStatus();
        labCoordinator11.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials17 = labCoordinator11.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType18 = labCoordinator11.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType18);
        com.yorku.lab.model.Credentials credentials20 = null;
        labCoordinator3.setCredentials(credentials20);
        java.lang.Class<?> wildcardClass22 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertTrue("'" + affiliationType18 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType18.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType9 = null;
        labCoordinator3.setAffiliation(affiliationType9);
        double double11 = labCoordinator3.getHourlyRate();
        boolean boolean12 = labCoordinator3.isActive();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(true);
        com.yorku.lab.enums.AccountStatus accountStatus17 = labCoordinator3.getStatus();
        java.lang.String str18 = labCoordinator3.getUserId();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(accountStatus17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = labCoordinator3.getAffiliation();
        labCoordinator3.setActive(true);
        org.junit.Assert.assertTrue("'" + affiliationType4 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType4.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.model.Credentials credentials12 = labCoordinator3.getCredentials();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        boolean boolean10 = labCoordinator3.isActive();
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        labCoordinator3.setStatus(accountStatus11);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        labCoordinator3.setStatus(accountStatus13);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        labCoordinator3.setAffiliation(affiliationType13);
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setHourlyRate((double) '4');
        labCoordinator3.setIdOrCertificationNumber("");
        java.lang.String str20 = labCoordinator3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType16 = labCoordinator3.getAffiliation();
        com.yorku.lab.enums.UserType userType17 = labCoordinator3.getType();
        com.yorku.lab.model.Credentials credentials18 = labCoordinator3.getCredentials();
        double double19 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType17.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertNull(credentials18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator11 = new com.yorku.lab.model.LabCoordinator("", "", credentials10);
        labCoordinator11.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator11.getStatus();
        labCoordinator11.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials17 = labCoordinator11.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType18 = labCoordinator11.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType18);
        labCoordinator3.setUserId("");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertTrue("'" + affiliationType18 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType18.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = labCoordinator3.getType();
        labCoordinator3.setUserId("");
        labCoordinator3.setIdOrCertificationNumber("");
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType4.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        com.yorku.lab.model.Credentials credentials15 = labCoordinator3.getCredentials();
        boolean boolean16 = labCoordinator3.isActive();
        labCoordinator3.setHourlyRate(0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(credentials15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        labCoordinator3.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType11 = labCoordinator3.getAffiliation();
        labCoordinator3.setIdOrCertificationNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + affiliationType11 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType11.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        double double10 = labCoordinator3.getHourlyRate();
        labCoordinator3.setActive(true);
        labCoordinator3.setHourlyRate(0.0d);
        double double15 = labCoordinator3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        labCoordinator3.setStatus(accountStatus16);
        labCoordinator3.setActive(false);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setUserId("");
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        labCoordinator3.setStatus(accountStatus10);
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        labCoordinator3.setStatus(accountStatus12);
        labCoordinator3.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        labCoordinator3.setIdOrCertificationNumber("hi!");
        labCoordinator3.setHourlyRate((double) 0L);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        java.lang.String str9 = labCoordinator3.getFullName();
        java.lang.Class<?> wildcardClass10 = labCoordinator3.getClass();
        org.junit.Assert.assertNull(affiliationType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials6 = labCoordinator3.getCredentials();
        labCoordinator3.setUserId("");
        com.yorku.lab.enums.AffiliationType affiliationType9 = labCoordinator3.getAffiliation();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        labCoordinator3.setStatus(accountStatus10);
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertTrue("'" + affiliationType9 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType9.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        labCoordinator3.setStatus(accountStatus12);
        com.yorku.lab.enums.AffiliationType affiliationType14 = null;
        labCoordinator3.setAffiliation(affiliationType14);
        com.yorku.lab.model.Credentials credentials16 = labCoordinator3.getCredentials();
        com.yorku.lab.model.Credentials credentials17 = labCoordinator3.getCredentials();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(credentials16);
        org.junit.Assert.assertNull(credentials17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        labCoordinator3.setStatus(accountStatus12);
        com.yorku.lab.enums.AffiliationType affiliationType14 = null;
        labCoordinator3.setAffiliation(affiliationType14);
        com.yorku.lab.model.Credentials credentials16 = labCoordinator3.getCredentials();
        com.yorku.lab.model.Credentials credentials19 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator20 = new com.yorku.lab.model.LabCoordinator("", "", credentials19);
        labCoordinator20.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus23 = labCoordinator20.getStatus();
        java.lang.String str24 = labCoordinator20.getUserId();
        com.yorku.lab.model.Credentials credentials27 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator28 = new com.yorku.lab.model.LabCoordinator("", "", credentials27);
        labCoordinator28.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus31 = labCoordinator28.getStatus();
        labCoordinator28.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials34 = labCoordinator28.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType35 = labCoordinator28.getAffiliation();
        labCoordinator20.setAffiliation(affiliationType35);
        labCoordinator3.setAffiliation(affiliationType35);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(credentials16);
        org.junit.Assert.assertNull(accountStatus23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(accountStatus31);
        org.junit.Assert.assertNull(credentials34);
        org.junit.Assert.assertTrue("'" + affiliationType35 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType35.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        double double13 = labCoordinator3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials16 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator17 = new com.yorku.lab.model.LabCoordinator("", "", credentials16);
        labCoordinator17.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus20 = labCoordinator17.getStatus();
        labCoordinator17.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials23 = labCoordinator17.getCredentials();
        com.yorku.lab.model.Credentials credentials26 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator27 = new com.yorku.lab.model.LabCoordinator("", "", credentials26);
        labCoordinator27.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus30 = labCoordinator27.getStatus();
        java.lang.String str31 = labCoordinator27.getUserId();
        labCoordinator27.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType34 = labCoordinator27.getAffiliation();
        labCoordinator17.setAffiliation(affiliationType34);
        com.yorku.lab.enums.AffiliationType affiliationType36 = labCoordinator17.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType36);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertNull(credentials23);
        org.junit.Assert.assertNull(accountStatus30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType34 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType34.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType36 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType36.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        labCoordinator3.setAffiliation(affiliationType6);
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus10 = labCoordinator3.getStatus();
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType16 = labCoordinator3.getAffiliation();
        com.yorku.lab.enums.UserType userType17 = labCoordinator3.getType();
        com.yorku.lab.model.Credentials credentials18 = labCoordinator3.getCredentials();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = credentials18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType17.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertNull(credentials18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus15 = labCoordinator3.getStatus();
        labCoordinator3.setActive(false);
        double double18 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(accountStatus15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = labCoordinator3.getCredentials();
        java.lang.String str12 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        labCoordinator3.setAffiliation(affiliationType13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        labCoordinator3.setFullName("hi!");
        com.yorku.lab.enums.UserType userType17 = labCoordinator3.getType();
        java.lang.String str18 = labCoordinator3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType17.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials9 = labCoordinator3.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType10 = labCoordinator3.getAffiliation();
        com.yorku.lab.model.Credentials credentials11 = null;
        labCoordinator3.setCredentials(credentials11);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(credentials9);
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        labCoordinator3.setActive(false);
        com.yorku.lab.enums.AccountStatus accountStatus12 = null;
        labCoordinator3.setStatus(accountStatus12);
        com.yorku.lab.model.Credentials credentials14 = null;
        labCoordinator3.setCredentials(credentials14);
        labCoordinator3.setHourlyRate((double) (byte) 10);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setActive(false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        double double4 = labCoordinator3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials5 = labCoordinator3.getCredentials();
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(credentials5);
        org.junit.Assert.assertNull(accountStatus6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setUserId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        double double9 = labCoordinator3.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        labCoordinator3.setAffiliation(affiliationType13);
        java.lang.String str15 = labCoordinator3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        labCoordinator3.setStatus(accountStatus16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType9 = null;
        labCoordinator3.setAffiliation(affiliationType9);
        com.yorku.lab.enums.UserType userType11 = labCoordinator3.getType();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType11.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType8 = labCoordinator3.getAffiliation();
        labCoordinator3.setActive(false);
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setUserId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        labCoordinator3.setUserId("");
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setFullName("");
        labCoordinator3.setHourlyRate((double) 100L);
        com.yorku.lab.model.Credentials credentials22 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator23 = new com.yorku.lab.model.LabCoordinator("", "", credentials22);
        labCoordinator23.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus26 = labCoordinator23.getStatus();
        java.lang.String str27 = labCoordinator23.getUserId();
        labCoordinator23.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType30 = labCoordinator23.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType30);
        com.yorku.lab.enums.AccountStatus accountStatus32 = null;
        labCoordinator3.setStatus(accountStatus32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(accountStatus26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + affiliationType30 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType30.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        com.yorku.lab.model.Credentials credentials6 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator7 = new com.yorku.lab.model.LabCoordinator("", "", credentials6);
        labCoordinator7.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus10 = labCoordinator7.getStatus();
        java.lang.String str11 = labCoordinator7.getUserId();
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator15 = new com.yorku.lab.model.LabCoordinator("", "", credentials14);
        labCoordinator15.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus18 = labCoordinator15.getStatus();
        labCoordinator15.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials21 = labCoordinator15.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType22 = labCoordinator15.getAffiliation();
        labCoordinator7.setAffiliation(affiliationType22);
        com.yorku.lab.model.Credentials credentials24 = null;
        labCoordinator7.setCredentials(credentials24);
        com.yorku.lab.enums.AffiliationType affiliationType26 = labCoordinator7.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType26);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNull(credentials21);
        org.junit.Assert.assertTrue("'" + affiliationType22 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType22.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType26 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType26.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        labCoordinator3.setFullName("");
        double double10 = labCoordinator3.getHourlyRate();
        java.lang.String str11 = labCoordinator3.getUserId();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        boolean boolean9 = labCoordinator3.isActive();
        java.lang.String str10 = labCoordinator3.getUserId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("hi!", "", credentials2);
        labCoordinator3.setFullName("");
        labCoordinator3.setHourlyRate((double) (-1.0f));
        java.lang.String str8 = labCoordinator3.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus6 = labCoordinator3.getStatus();
        java.lang.String str7 = labCoordinator3.getUserId();
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator11 = new com.yorku.lab.model.LabCoordinator("", "", credentials10);
        labCoordinator11.setUserId("hi!");
        com.yorku.lab.enums.AccountStatus accountStatus14 = labCoordinator11.getStatus();
        labCoordinator11.setHourlyRate(0.0d);
        com.yorku.lab.model.Credentials credentials17 = labCoordinator11.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType18 = labCoordinator11.getAffiliation();
        labCoordinator3.setAffiliation(affiliationType18);
        labCoordinator3.setHourlyRate((double) 10);
        com.yorku.lab.enums.AffiliationType affiliationType22 = labCoordinator3.getAffiliation();
        org.junit.Assert.assertNull(accountStatus6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNull(credentials17);
        org.junit.Assert.assertTrue("'" + affiliationType18 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType18.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType22 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType22.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        labCoordinator3.setUserId("");
        com.yorku.lab.enums.AffiliationType affiliationType13 = labCoordinator3.getAffiliation();
        com.yorku.lab.enums.AffiliationType affiliationType14 = labCoordinator3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertTrue("'" + affiliationType14 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType14.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        java.lang.Class<?> wildcardClass13 = labCoordinator3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        com.yorku.lab.model.Credentials credentials7 = null;
        labCoordinator3.setCredentials(credentials7);
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        labCoordinator3.setStatus(accountStatus9);
        labCoordinator3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType13 = labCoordinator3.getType();
        java.lang.String str14 = labCoordinator3.getFullName();
        labCoordinator3.setUserId("");
        java.lang.String str17 = labCoordinator3.getFullName();
        java.lang.String str18 = labCoordinator3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + userType13 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType13.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.LabCoordinator labCoordinator3 = new com.yorku.lab.model.LabCoordinator("", "", credentials2);
        labCoordinator3.setUserId("hi!");
        java.lang.String str6 = labCoordinator3.getFullName();
        labCoordinator3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials9 = null;
        labCoordinator3.setCredentials(credentials9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = null;
        labCoordinator3.setAffiliation(affiliationType11);
        com.yorku.lab.enums.AffiliationType affiliationType13 = null;
        labCoordinator3.setAffiliation(affiliationType13);
        java.lang.String str15 = labCoordinator3.getFullName();
        labCoordinator3.setHourlyRate((double) '4');
        com.yorku.lab.enums.UserType userType18 = labCoordinator3.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + userType18 + "' != '" + com.yorku.lab.enums.UserType.LABCOORDINATOR + "'", userType18.equals(com.yorku.lab.enums.UserType.LABCOORDINATOR));
    }
}

