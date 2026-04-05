package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRegressionTest0 {

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
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials6 = null;
        student3.setCredentials(credentials6);
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setIdOrCertificationNumber("hi!");
        boolean boolean10 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        student3.setStatus(accountStatus8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials8 = null;
        student3.setCredentials(credentials8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student4 = new com.yorku.lab.model.Student("", "", credentials2, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        boolean boolean10 = student3.isActive();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        student3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials8 = student3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        double double4 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        student3.setAffiliation(affiliationType8);
        double double10 = student3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        student3.setStatus(accountStatus11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        java.lang.String str10 = student3.getIdOrCertificationNumber();
        java.lang.String str11 = student3.getFullName();
        com.yorku.lab.model.Credentials credentials12 = student3.getCredentials();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.UserType userType8 = student3.getType();
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType8.equals(com.yorku.lab.enums.UserType.STUDENT));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        student3.setFullName("");
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        student3.setFullName("hi!");
        student3.setFullName("");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        student3.setFullName("");
        student3.setIdOrCertificationNumber("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        student3.setUserId("");
        java.lang.String str12 = student3.getUserId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        student3.setAffiliation(affiliationType8);
        java.lang.String str10 = student3.getUserId();
        student3.setFullName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        student3.setStatus(accountStatus8);
        java.lang.String str10 = student3.getFullName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        student3.setFullName("");
        student3.setHourlyRate(0.0d);
        student3.setActive(false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        student3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        student3.setStatus(accountStatus16);
        student3.setActive(false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        java.lang.String str6 = student3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials7 = student3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        student3.setUserId("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student4 = new com.yorku.lab.model.Student("", "hi!", credentials2, "");
        student4.setUserId("");
        student4.setActive(true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) (short) 0);
        student3.setHourlyRate(0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        student3.setActive(false);
        student3.setHourlyRate((double) 'a');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        java.lang.String str10 = student3.getIdOrCertificationNumber();
        java.lang.String str11 = student3.getFullName();
        java.lang.String str12 = student3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        java.lang.String str8 = student3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = student3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus10 = student3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountStatus9 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus9.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + accountStatus10 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus10.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        student3.setStatus(accountStatus8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student4 = new com.yorku.lab.model.Student("", "hi!", credentials2, "");
        student4.setUserId("");
        student4.setIdOrCertificationNumber("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        java.lang.String str10 = student3.getIdOrCertificationNumber();
        java.lang.String str11 = student3.getUserId();
        student3.setFullName("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        java.lang.String str8 = student3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = student3.getStatus();
        com.yorku.lab.enums.UserType userType10 = student3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountStatus9 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus9.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType10.equals(com.yorku.lab.enums.UserType.STUDENT));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        java.lang.String str6 = student3.getIdOrCertificationNumber();
        student3.setHourlyRate(10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) (short) 0);
        student3.setIdOrCertificationNumber("hi!");
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        java.lang.String str8 = student3.getFullName();
        com.yorku.lab.enums.UserType userType9 = student3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + userType9 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType9.equals(com.yorku.lab.enums.UserType.STUDENT));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        student3.setAffiliation(affiliationType8);
        student3.setActive(false);
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Student student15 = new com.yorku.lab.model.Student("", "", credentials14);
        student15.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus18 = student15.getStatus();
        student3.setStatus(accountStatus18);
        org.junit.Assert.assertTrue("'" + accountStatus18 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus18.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student4 = new com.yorku.lab.model.Student("hi!", "", credentials2, "");
        student4.setActive(true);
        com.yorku.lab.model.Credentials credentials7 = null;
        student4.setCredentials(credentials7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        java.lang.String str10 = student3.getUserId();
        student3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType13 = student3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.UserType userType6 = student3.getType();
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType6.equals(com.yorku.lab.enums.UserType.STUDENT));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        student3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.Student student13 = new com.yorku.lab.model.Student("", "", credentials12);
        com.yorku.lab.enums.UserType userType14 = student13.getType();
        boolean boolean15 = student13.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType16 = student13.getAffiliation();
        student3.setAffiliation(affiliationType16);
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType14.equals(com.yorku.lab.enums.UserType.STUDENT));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        java.lang.String str10 = student3.getIdOrCertificationNumber();
        student3.setUserId("");
        student3.setActive(false);
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        student3.setFullName("");
        student3.setHourlyRate(0.0d);
        java.lang.String str18 = student3.getFullName();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        student3.setHourlyRate((double) (short) 10);
        student3.setFullName("");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student4 = new com.yorku.lab.model.Student("hi!", "", credentials2, "");
        java.lang.String str5 = student4.getFullName();
        java.lang.String str6 = student4.getUserId();
        com.yorku.lab.model.Credentials credentials7 = null;
        student4.setCredentials(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        student3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType6 = student3.getAffiliation();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertTrue("'" + affiliationType6 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType6.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        student3.setUserId("");
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Student student15 = new com.yorku.lab.model.Student("", "", credentials14);
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        student15.setStatus(accountStatus16);
        student15.setHourlyRate((double) '4');
        student15.setActive(true);
        com.yorku.lab.model.Credentials credentials22 = null;
        student15.setCredentials(credentials22);
        student15.setFullName("");
        student15.setFullName("");
        student15.setActive(true);
        com.yorku.lab.model.Credentials credentials32 = null;
        com.yorku.lab.model.Student student33 = new com.yorku.lab.model.Student("", "", credentials32);
        student33.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus36 = student33.getStatus();
        student15.setStatus(accountStatus36);
        com.yorku.lab.enums.AccountStatus accountStatus38 = student15.getStatus();
        student3.setStatus(accountStatus38);
        org.junit.Assert.assertTrue("'" + accountStatus36 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus36.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + accountStatus38 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus38.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        java.lang.String str10 = student3.getUserId();
        java.lang.String str11 = student3.getUserId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        student3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        student3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.Student student11 = new com.yorku.lab.model.Student("", "", credentials10);
        com.yorku.lab.enums.UserType userType12 = student11.getType();
        com.yorku.lab.enums.AffiliationType affiliationType13 = student11.getAffiliation();
        student3.setAffiliation(affiliationType13);
        java.lang.String str15 = student3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials18 = null;
        com.yorku.lab.model.Student student19 = new com.yorku.lab.model.Student("hi!", "", credentials18);
        student19.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials24 = null;
        com.yorku.lab.model.Student student25 = new com.yorku.lab.model.Student("", "", credentials24);
        com.yorku.lab.enums.AffiliationType affiliationType26 = null;
        student25.setAffiliation(affiliationType26);
        student25.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus30 = student25.getStatus();
        student19.setStatus(accountStatus30);
        student3.setStatus(accountStatus30);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType12.equals(com.yorku.lab.enums.UserType.STUDENT));
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + accountStatus30 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus30.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        java.lang.String str10 = student3.getIdOrCertificationNumber();
        java.lang.String str11 = student3.getFullName();
        java.lang.String str12 = student3.getUserId();
        java.lang.String str13 = student3.getIdOrCertificationNumber();
        java.lang.String str14 = student3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        student3.setCredentials(credentials10);
        student3.setFullName("");
        student3.setFullName("");
        student3.setActive(true);
        com.yorku.lab.enums.UserType userType18 = student3.getType();
        org.junit.Assert.assertTrue("'" + userType18 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType18.equals(com.yorku.lab.enums.UserType.STUDENT));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        student3.setAffiliation(affiliationType8);
        java.lang.String str10 = student3.getUserId();
        com.yorku.lab.enums.UserType userType11 = student3.getType();
        com.yorku.lab.model.Credentials credentials12 = student3.getCredentials();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType11.equals(com.yorku.lab.enums.UserType.STUDENT));
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setUserId("");
        student3.setActive(false);
        java.lang.String str10 = student3.getIdOrCertificationNumber();
        student3.setUserId("");
        java.lang.String str13 = student3.getIdOrCertificationNumber();
        java.lang.String str14 = student3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Student student3 = new com.yorku.lab.model.Student("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        student3.setStatus(accountStatus4);
        student3.setHourlyRate((double) '4');
        student3.setActive(true);
        com.yorku.lab.enums.UserType userType10 = student3.getType();
        java.lang.String str11 = student3.getUserId();
        student3.setUserId("");
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.STUDENT + "'", userType10.equals(com.yorku.lab.enums.UserType.STUDENT));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}

