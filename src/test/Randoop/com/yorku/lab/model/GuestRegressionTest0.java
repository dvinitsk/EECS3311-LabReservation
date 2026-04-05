package test.Randoop.com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GuestRegressionTest0 {

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
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        com.yorku.lab.model.Credentials credentials6 = null;
        guest3.setCredentials(credentials6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setFullName("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "", credentials2, "");
        com.yorku.lab.model.Credentials credentials5 = null;
        guest4.setCredentials(credentials5);
        guest4.setHourlyRate(0.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        java.lang.String str7 = guest3.getFullName();
        com.yorku.lab.model.Credentials credentials8 = guest3.getCredentials();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "", credentials2, "");
        guest4.setFullName("");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setIdOrCertificationNumber("");
        java.lang.Class<?> wildcardClass6 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = null;
        guest3.setCredentials(credentials11);
        java.lang.String str13 = guest3.getFullName();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        com.yorku.lab.model.Credentials credentials6 = null;
        guest4.setCredentials(credentials6);
        java.lang.Class<?> wildcardClass8 = guest4.getClass();
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        double double5 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        java.lang.Class<?> wildcardClass12 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        guest3.setStatus(accountStatus8);
        java.lang.String str10 = guest3.getUserId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        guest3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("hi!", "hi!", credentials2, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        com.yorku.lab.enums.AccountStatus accountStatus6 = null;
        guest3.setStatus(accountStatus6);
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        com.yorku.lab.model.Credentials credentials17 = null;
        com.yorku.lab.model.Guest guest18 = new com.yorku.lab.model.Guest("", "hi!", credentials17);
        guest18.setFullName("");
        guest18.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus23 = guest18.getStatus();
        guest3.setStatus(accountStatus23);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + accountStatus23 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus23.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + affiliationType6 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType6.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        java.lang.String str15 = guest3.getUserId();
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        guest3.setStatus(accountStatus16);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setFullName("");
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        java.lang.String str7 = guest3.getFullName();
        com.yorku.lab.enums.UserType userType8 = guest3.getType();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType8.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        guest3.setActive(false);
        guest3.setIdOrCertificationNumber("hi!");
        double double13 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        guest3.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType12 = guest3.getAffiliation();
        guest3.setFullName("");
        org.junit.Assert.assertNull(affiliationType12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = guest3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        guest3.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType12 = guest3.getAffiliation();
        java.lang.String str13 = guest3.getUserId();
        org.junit.Assert.assertNull(affiliationType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        guest3.setStatus(accountStatus9);
        boolean boolean11 = guest3.isActive();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        java.lang.String str6 = guest3.getFullName();
        double double7 = guest3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        double double6 = guest3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials7 = guest3.getCredentials();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(credentials7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        guest3.setUserId("");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.String str10 = guest3.getUserId();
        guest3.setUserId("");
        java.lang.String str13 = guest3.getUserId();
        guest3.setHourlyRate((double) (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        com.yorku.lab.model.Credentials credentials6 = null;
        guest4.setCredentials(credentials6);
        guest4.setHourlyRate(1.0d);
        com.yorku.lab.enums.AffiliationType affiliationType10 = guest4.getAffiliation();
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + affiliationType10 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType10.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Credentials credentials6 = guest3.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType7 = null;
        guest3.setAffiliation(affiliationType7);
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getUserId();
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType8 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        guest3.setActive(false);
        java.lang.String str11 = guest3.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.Class<?> wildcardClass8 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        java.lang.String str6 = guest3.getFullName();
        java.lang.String str7 = guest3.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        guest3.setIdOrCertificationNumber("");
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        guest3.setCredentials(credentials15);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "", credentials2, "");
        com.yorku.lab.model.Credentials credentials5 = null;
        guest4.setCredentials(credentials5);
        com.yorku.lab.enums.UserType userType7 = guest4.getType();
        java.lang.String str8 = guest4.getIdOrCertificationNumber();
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType7.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        java.lang.String str15 = guest3.getFullName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        guest4.setActive(false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.String str10 = guest3.getUserId();
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.Guest guest16 = new com.yorku.lab.model.Guest("", "", credentials15);
        guest16.setUserId("");
        boolean boolean19 = guest16.isActive();
        boolean boolean20 = guest16.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType21 = guest16.getAffiliation();
        guest3.setAffiliation(affiliationType21);
        double double23 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + affiliationType21 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType21.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("hi!", "", credentials2, "");
        guest4.setActive(true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        guest3.setIdOrCertificationNumber("");
        double double13 = guest3.getHourlyRate();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = null;
        guest3.setCredentials(credentials11);
        guest3.setFullName("");
        com.yorku.lab.model.Credentials credentials15 = null;
        guest3.setCredentials(credentials15);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        guest3.setUserId("hi!");
        com.yorku.lab.model.Credentials credentials8 = guest3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        guest4.setHourlyRate(1.0d);
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        com.yorku.lab.model.Credentials credentials6 = null;
        guest4.setCredentials(credentials6);
        double double8 = guest4.getHourlyRate();
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        com.yorku.lab.enums.AccountStatus accountStatus6 = null;
        guest3.setStatus(accountStatus6);
        double double8 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials11 = null;
        com.yorku.lab.model.Guest guest12 = new com.yorku.lab.model.Guest("", "", credentials11);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest12.setStatus(accountStatus13);
        guest12.setHourlyRate(0.0d);
        guest12.setActive(true);
        java.lang.String str19 = guest12.getUserId();
        guest12.setUserId("");
        com.yorku.lab.model.Credentials credentials24 = null;
        com.yorku.lab.model.Guest guest25 = new com.yorku.lab.model.Guest("", "", credentials24);
        guest25.setUserId("");
        boolean boolean28 = guest25.isActive();
        boolean boolean29 = guest25.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType30 = guest25.getAffiliation();
        guest12.setAffiliation(affiliationType30);
        com.yorku.lab.model.Credentials credentials34 = null;
        com.yorku.lab.model.Guest guest35 = new com.yorku.lab.model.Guest("hi!", "", credentials34);
        com.yorku.lab.enums.UserType userType36 = guest35.getType();
        com.yorku.lab.enums.AccountStatus accountStatus37 = guest35.getStatus();
        guest12.setStatus(accountStatus37);
        guest3.setStatus(accountStatus37);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + affiliationType30 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType30.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + userType36 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType36.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus37 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus37.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType7 = guest3.getType();
        guest3.setUserId("");
        double double10 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType7.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        guest3.setUserId("hi!");
        double double8 = guest3.getHourlyRate();
        guest3.setActive(false);
        com.yorku.lab.model.Credentials credentials11 = null;
        guest3.setCredentials(credentials11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        java.lang.String str9 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        double double12 = guest3.getHourlyRate();
        boolean boolean13 = guest3.isActive();
        com.yorku.lab.enums.UserType userType14 = guest3.getType();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType14.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        com.yorku.lab.model.Credentials credentials6 = null;
        guest4.setCredentials(credentials6);
        guest4.setHourlyRate(1.0d);
        com.yorku.lab.model.Credentials credentials10 = null;
        guest4.setCredentials(credentials10);
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        java.lang.String str6 = guest4.getIdOrCertificationNumber();
        guest4.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        java.lang.String str11 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Credentials credentials6 = guest3.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType7 = null;
        guest3.setAffiliation(affiliationType7);
        double double9 = guest3.getHourlyRate();
        java.lang.String str10 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setFullName("");
        boolean boolean6 = guest3.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AccountStatus accountStatus8 = guest3.getStatus();
        guest3.setUserId("");
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        java.lang.String str6 = guest3.getFullName();
        double double7 = guest3.getHourlyRate();
        guest3.setFullName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus8 = guest3.getStatus();
        guest3.setActive(false);
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        boolean boolean6 = guest3.isActive();
        com.yorku.lab.model.Credentials credentials7 = guest3.getCredentials();
        java.lang.String str8 = guest3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType9 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(credentials7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + affiliationType9 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType9.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        double double12 = guest3.getHourlyRate();
        boolean boolean13 = guest3.isActive();
        guest3.setHourlyRate((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("hi!", "", credentials2, "hi!");
        com.yorku.lab.enums.AffiliationType affiliationType5 = guest4.getAffiliation();
        java.lang.Class<?> wildcardClass6 = affiliationType5.getClass();
        org.junit.Assert.assertTrue("'" + affiliationType5 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType5.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType7 = guest3.getType();
        guest3.setUserId("");
        guest3.setHourlyRate((double) (-1.0f));
        com.yorku.lab.enums.UserType userType12 = guest3.getType();
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType7.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType12.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("hi!", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        guest3.setFullName("");
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getFullName();
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        guest3.setUserId("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.String str10 = guest3.getUserId();
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.Guest guest16 = new com.yorku.lab.model.Guest("", "", credentials15);
        guest16.setUserId("");
        boolean boolean19 = guest16.isActive();
        boolean boolean20 = guest16.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType21 = guest16.getAffiliation();
        guest3.setAffiliation(affiliationType21);
        com.yorku.lab.model.Credentials credentials25 = null;
        com.yorku.lab.model.Guest guest26 = new com.yorku.lab.model.Guest("hi!", "", credentials25);
        com.yorku.lab.enums.UserType userType27 = guest26.getType();
        com.yorku.lab.enums.AccountStatus accountStatus28 = guest26.getStatus();
        guest3.setStatus(accountStatus28);
        boolean boolean30 = guest3.isActive();
        java.lang.String str31 = guest3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType32 = null;
        guest3.setAffiliation(affiliationType32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + affiliationType21 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType21.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + userType27 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType27.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus28 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus28.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "", credentials2, "");
        java.lang.String str5 = guest4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        com.yorku.lab.enums.UserType userType11 = guest3.getType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType11.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        guest3.setHourlyRate(0.0d);
        double double7 = guest3.getHourlyRate();
        guest3.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.Guest guest14 = new com.yorku.lab.model.Guest("hi!", "", credentials12, "hi!");
        com.yorku.lab.enums.AffiliationType affiliationType15 = guest14.getAffiliation();
        guest3.setAffiliation(affiliationType15);
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType15 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType15.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        boolean boolean7 = guest3.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType8 = guest3.getAffiliation();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "");
        com.yorku.lab.enums.UserType userType5 = guest4.getType();
        com.yorku.lab.model.Credentials credentials6 = guest4.getCredentials();
        guest4.setHourlyRate(1.0d);
        org.junit.Assert.assertTrue("'" + userType5 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType5.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertNull(credentials6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.Class<?> wildcardClass10 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        guest3.setIdOrCertificationNumber("");
        guest3.setFullName("");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType9 = guest3.getAffiliation();
        java.lang.String str10 = guest3.getIdOrCertificationNumber();
        java.lang.String str11 = guest3.getFullName();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + affiliationType9 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType9.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        com.yorku.lab.model.Credentials credentials12 = null;
        guest3.setCredentials(credentials12);
        java.lang.String str14 = guest3.getFullName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setIdOrCertificationNumber("");
        guest3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials8 = guest3.getCredentials();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        java.lang.Class<?> wildcardClass11 = guest3.getClass();
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        guest3.setUserId("hi!");
        com.yorku.lab.enums.AffiliationType affiliationType8 = guest3.getAffiliation();
        java.lang.String str9 = guest3.getFullName();
        java.lang.String str10 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertTrue("'" + affiliationType8 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType8.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        java.lang.String str9 = guest3.getFullName();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.String str10 = guest3.getUserId();
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.Guest guest16 = new com.yorku.lab.model.Guest("", "", credentials15);
        guest16.setUserId("");
        boolean boolean19 = guest16.isActive();
        boolean boolean20 = guest16.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType21 = guest16.getAffiliation();
        guest3.setAffiliation(affiliationType21);
        com.yorku.lab.model.Credentials credentials25 = null;
        com.yorku.lab.model.Guest guest26 = new com.yorku.lab.model.Guest("hi!", "", credentials25);
        com.yorku.lab.enums.UserType userType27 = guest26.getType();
        com.yorku.lab.enums.AccountStatus accountStatus28 = guest26.getStatus();
        guest3.setStatus(accountStatus28);
        boolean boolean30 = guest3.isActive();
        java.lang.String str31 = guest3.getUserId();
        com.yorku.lab.model.Credentials credentials32 = guest3.getCredentials();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + affiliationType21 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType21.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + userType27 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType27.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus28 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus28.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(credentials32);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        boolean boolean6 = guest3.isActive();
        com.yorku.lab.model.Credentials credentials7 = guest3.getCredentials();
        guest3.setIdOrCertificationNumber("");
        guest3.setHourlyRate((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(credentials7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        guest3.setHourlyRate(0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        double double6 = guest3.getHourlyRate();
        double double7 = guest3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        guest3.setStatus(accountStatus8);
        com.yorku.lab.enums.AffiliationType affiliationType10 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(affiliationType10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        double double6 = guest3.getHourlyRate();
        double double7 = guest3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials8 = guest3.getCredentials();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AccountStatus accountStatus8 = guest3.getStatus();
        com.yorku.lab.model.Credentials credentials9 = guest3.getCredentials();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        com.yorku.lab.enums.AffiliationType affiliationType6 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + affiliationType6 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType6.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AffiliationType affiliationType9 = guest3.getAffiliation();
        java.lang.String str10 = guest3.getIdOrCertificationNumber();
        java.lang.String str11 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + affiliationType9 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType9.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials8 = null;
        guest3.setCredentials(credentials8);
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.Guest guest13 = new com.yorku.lab.model.Guest("hi!", "", credentials12);
        com.yorku.lab.enums.UserType userType14 = guest13.getType();
        com.yorku.lab.enums.AccountStatus accountStatus15 = guest13.getStatus();
        guest3.setStatus(accountStatus15);
        double double17 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType14.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus15 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus15.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.String str10 = guest3.getUserId();
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.Guest guest16 = new com.yorku.lab.model.Guest("", "", credentials15);
        guest16.setUserId("");
        boolean boolean19 = guest16.isActive();
        boolean boolean20 = guest16.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType21 = guest16.getAffiliation();
        guest3.setAffiliation(affiliationType21);
        com.yorku.lab.model.Credentials credentials25 = null;
        com.yorku.lab.model.Guest guest26 = new com.yorku.lab.model.Guest("hi!", "", credentials25);
        com.yorku.lab.enums.UserType userType27 = guest26.getType();
        com.yorku.lab.enums.AccountStatus accountStatus28 = guest26.getStatus();
        guest3.setStatus(accountStatus28);
        boolean boolean30 = guest3.isActive();
        java.lang.String str31 = guest3.getUserId();
        com.yorku.lab.enums.UserType userType32 = guest3.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + affiliationType21 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType21.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + userType27 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType27.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus28 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus28.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + userType32 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType32.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("hi!", "hi!", credentials2);
        boolean boolean4 = guest3.isActive();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        java.lang.String str11 = guest3.getUserId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setIdOrCertificationNumber("");
        boolean boolean6 = guest3.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = null;
        guest3.setCredentials(credentials11);
        guest3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus15 = guest3.getStatus();
        double double16 = guest3.getHourlyRate();
        double double17 = guest3.getHourlyRate();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(accountStatus15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        guest3.setStatus(accountStatus9);
        com.yorku.lab.enums.AccountStatus accountStatus11 = guest3.getStatus();
        guest3.setUserId("");
        boolean boolean14 = guest3.isActive();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "hi!", credentials2, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("hi!", "", credentials2, "hi!");
        java.lang.String str5 = guest4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        double double12 = guest3.getHourlyRate();
        boolean boolean13 = guest3.isActive();
        double double14 = guest3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        com.yorku.lab.enums.UserType userType6 = guest3.getType();
        java.lang.Class<?> wildcardClass7 = guest3.getClass();
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType6.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        com.yorku.lab.model.Credentials credentials5 = null;
        guest3.setCredentials(credentials5);
        java.lang.String str7 = guest3.getUserId();
        com.yorku.lab.model.Credentials credentials8 = guest3.getCredentials();
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        guest3.setUserId("hi!");
        double double8 = guest3.getHourlyRate();
        guest3.setFullName("");
        double double11 = guest3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType12 = guest3.getAffiliation();
        double double13 = guest3.getHourlyRate();
        boolean boolean14 = guest3.isActive();
        guest3.setUserId("hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str6 = guest3.getUserId();
        guest3.setUserId("");
        guest3.setActive(true);
        double double11 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        double double12 = guest3.getHourlyRate();
        java.lang.String str13 = guest3.getFullName();
        guest3.setFullName("");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Credentials credentials6 = guest3.getCredentials();
        com.yorku.lab.model.Credentials credentials7 = null;
        guest3.setCredentials(credentials7);
        com.yorku.lab.model.Credentials credentials9 = guest3.getCredentials();
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        guest3.setFullName("");
        guest3.setActive(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        double double9 = guest3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.Guest guest13 = new com.yorku.lab.model.Guest("", "", credentials12);
        guest13.setIdOrCertificationNumber("");
        java.lang.String str16 = guest13.getUserId();
        guest13.setUserId("");
        com.yorku.lab.enums.AccountStatus accountStatus19 = guest13.getStatus();
        guest3.setStatus(accountStatus19);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + accountStatus19 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus19.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        com.yorku.lab.enums.UserType userType15 = guest3.getType();
        com.yorku.lab.enums.AffiliationType affiliationType16 = null;
        guest3.setAffiliation(affiliationType16);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType15 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType15.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "", credentials2, "");
        com.yorku.lab.model.Credentials credentials5 = null;
        guest4.setCredentials(credentials5);
        com.yorku.lab.enums.UserType userType7 = guest4.getType();
        com.yorku.lab.model.Credentials credentials8 = guest4.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType9 = guest4.getAffiliation();
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType7.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertTrue("'" + affiliationType9 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType9.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        guest3.setStatus(accountStatus9);
        com.yorku.lab.enums.AccountStatus accountStatus11 = guest3.getStatus();
        guest3.setActive(true);
        java.lang.String str14 = guest3.getUserId();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        java.lang.String str6 = guest3.getIdOrCertificationNumber();
        boolean boolean7 = guest3.isActive();
        guest3.setUserId("");
        java.lang.String str10 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        double double13 = guest3.getHourlyRate();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        guest3.setUserId("hi!");
        double double8 = guest3.getHourlyRate();
        guest3.setFullName("");
        double double11 = guest3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType12 = guest3.getAffiliation();
        java.lang.String str13 = guest3.getUserId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + affiliationType12 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType12.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        guest3.setActive(false);
        guest3.setUserId("hi!");
        double double13 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials8 = guest3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setActive(false);
        boolean boolean6 = guest3.isActive();
        guest3.setIdOrCertificationNumber("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        guest3.setStatus(accountStatus9);
        com.yorku.lab.enums.AffiliationType affiliationType11 = guest3.getAffiliation();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + affiliationType11 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType11.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.UserType userType7 = guest3.getType();
        guest3.setUserId("");
        boolean boolean10 = guest3.isActive();
        guest3.setActive(false);
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType7.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        guest3.setStatus(accountStatus9);
        boolean boolean11 = guest3.isActive();
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Guest guest15 = new com.yorku.lab.model.Guest("", "hi!", credentials14);
        com.yorku.lab.enums.UserType userType16 = guest15.getType();
        com.yorku.lab.model.Credentials credentials17 = null;
        guest15.setCredentials(credentials17);
        com.yorku.lab.enums.AccountStatus accountStatus19 = guest15.getStatus();
        guest3.setStatus(accountStatus19);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + userType16 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType16.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus19 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus19.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("hi!", "", credentials2, "hi!");
        com.yorku.lab.model.Credentials credentials5 = null;
        guest4.setCredentials(credentials5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest4 = new com.yorku.lab.model.Guest("", "", credentials2, "");
        com.yorku.lab.model.Credentials credentials5 = null;
        guest4.setCredentials(credentials5);
        com.yorku.lab.enums.UserType userType7 = guest4.getType();
        com.yorku.lab.model.Credentials credentials8 = guest4.getCredentials();
        com.yorku.lab.model.Credentials credentials9 = guest4.getCredentials();
        org.junit.Assert.assertTrue("'" + userType7 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType7.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertNull(credentials8);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials11 = guest3.getCredentials();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(credentials11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        java.lang.String str8 = guest3.getFullName();
        double double9 = guest3.getHourlyRate();
        com.yorku.lab.model.Credentials credentials10 = guest3.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType11 = guest3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(credentials10);
        org.junit.Assert.assertTrue("'" + affiliationType11 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType11.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        double double15 = guest3.getHourlyRate();
        com.yorku.lab.enums.AffiliationType affiliationType16 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(affiliationType16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        com.yorku.lab.enums.AccountStatus accountStatus5 = guest3.getStatus();
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        guest3.setAffiliation(affiliationType6);
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus5 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus5.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        java.lang.String str13 = guest3.getUserId();
        java.lang.Class<?> wildcardClass14 = guest3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        guest3.setHourlyRate(0.0d);
        double double7 = guest3.getHourlyRate();
        guest3.setIdOrCertificationNumber("hi!");
        guest3.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        double double6 = guest3.getHourlyRate();
        double double7 = guest3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus8 = guest3.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + accountStatus8 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus8.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        guest3.setFullName("");
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.Guest guest11 = new com.yorku.lab.model.Guest("", "", credentials10);
        guest11.setUserId("");
        boolean boolean14 = guest11.isActive();
        boolean boolean15 = guest11.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType16 = guest11.getAffiliation();
        guest3.setAffiliation(affiliationType16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        java.lang.String str15 = guest3.getUserId();
        com.yorku.lab.enums.AffiliationType affiliationType16 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(affiliationType16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.UserType userType4 = guest3.getType();
        com.yorku.lab.enums.AffiliationType affiliationType5 = guest3.getAffiliation();
        org.junit.Assert.assertTrue("'" + userType4 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType4.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + affiliationType5 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType5.equals(com.yorku.lab.enums.AffiliationType.GUEST));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        java.lang.String str10 = guest3.getUserId();
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        com.yorku.lab.model.Guest guest16 = new com.yorku.lab.model.Guest("", "", credentials15);
        guest16.setUserId("");
        boolean boolean19 = guest16.isActive();
        boolean boolean20 = guest16.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType21 = guest16.getAffiliation();
        guest3.setAffiliation(affiliationType21);
        com.yorku.lab.model.Credentials credentials25 = null;
        com.yorku.lab.model.Guest guest26 = new com.yorku.lab.model.Guest("hi!", "", credentials25);
        com.yorku.lab.enums.UserType userType27 = guest26.getType();
        com.yorku.lab.enums.AccountStatus accountStatus28 = guest26.getStatus();
        guest3.setStatus(accountStatus28);
        boolean boolean30 = guest3.isActive();
        java.lang.String str31 = guest3.getUserId();
        double double32 = guest3.getHourlyRate();
        guest3.setUserId("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + affiliationType21 + "' != '" + com.yorku.lab.enums.AffiliationType.GUEST + "'", affiliationType21.equals(com.yorku.lab.enums.AffiliationType.GUEST));
        org.junit.Assert.assertTrue("'" + userType27 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType27.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertTrue("'" + accountStatus28 + "' != '" + com.yorku.lab.enums.AccountStatus.ACTIVE + "'", accountStatus28.equals(com.yorku.lab.enums.AccountStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        guest3.setActive(false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AffiliationType affiliationType4 = null;
        guest3.setAffiliation(affiliationType4);
        com.yorku.lab.model.Credentials credentials6 = guest3.getCredentials();
        com.yorku.lab.enums.AffiliationType affiliationType7 = null;
        guest3.setAffiliation(affiliationType7);
        double double9 = guest3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus10 = null;
        guest3.setStatus(accountStatus10);
        com.yorku.lab.enums.UserType userType12 = guest3.getType();
        java.lang.String str13 = guest3.getUserId();
        org.junit.Assert.assertNull(credentials6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType12.equals(com.yorku.lab.enums.UserType.GUEST));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setUserId("");
        boolean boolean6 = guest3.isActive();
        boolean boolean7 = guest3.isActive();
        com.yorku.lab.enums.UserType userType8 = guest3.getType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType8.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        guest3.setActive(true);
        guest3.setActive(false);
        com.yorku.lab.model.Credentials credentials12 = null;
        guest3.setCredentials(credentials12);
        guest3.setUserId("");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.enums.AccountStatus accountStatus9 = null;
        guest3.setStatus(accountStatus9);
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        guest3.setStatus(accountStatus11);
        guest3.setUserId("");
        com.yorku.lab.model.Credentials credentials15 = null;
        guest3.setCredentials(credentials15);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials9 = null;
        guest3.setCredentials(credentials9);
        com.yorku.lab.model.Credentials credentials11 = null;
        guest3.setCredentials(credentials11);
        guest3.setFullName("");
        com.yorku.lab.enums.UserType userType15 = guest3.getType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + userType15 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType15.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        java.lang.String str13 = guest3.getUserId();
        com.yorku.lab.model.Credentials credentials14 = null;
        guest3.setCredentials(credentials14);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        guest3.setAffiliation(affiliationType8);
        double double10 = guest3.getHourlyRate();
        guest3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus13 = null;
        guest3.setStatus(accountStatus13);
        com.yorku.lab.enums.AccountStatus accountStatus15 = null;
        guest3.setStatus(accountStatus15);
        com.yorku.lab.enums.UserType userType17 = guest3.getType();
        guest3.setUserId("");
        guest3.setFullName("hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + userType17 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType17.equals(com.yorku.lab.enums.UserType.GUEST));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        guest3.setIdOrCertificationNumber("");
        java.lang.String str8 = guest3.getUserId();
        guest3.setFullName("");
        com.yorku.lab.model.Credentials credentials11 = null;
        guest3.setCredentials(credentials11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setHourlyRate(0.0d);
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        guest3.setFullName("");
        boolean boolean11 = guest3.isActive();
        com.yorku.lab.model.Credentials credentials12 = guest3.getCredentials();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        guest3.setActive(true);
        java.lang.String str6 = guest3.getFullName();
        double double7 = guest3.getHourlyRate();
        java.lang.String str8 = guest3.getUserId();
        java.lang.String str9 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        guest3.setStatus(accountStatus4);
        guest3.setFullName("");
        java.lang.String str8 = guest3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Guest guest3 = new com.yorku.lab.model.Guest("", "hi!", credentials2);
        guest3.setFullName("");
        guest3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.UserType userType8 = guest3.getType();
        guest3.setActive(false);
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.GUEST + "'", userType8.equals(com.yorku.lab.enums.UserType.GUEST));
    }
}

