package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacultyRegressionTest0 {

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
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials6 = null;
        faculty3.setCredentials(credentials6);
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setIdOrCertificationNumber("hi!");
        boolean boolean10 = faculty3.isActive();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        faculty3.setStatus(accountStatus8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials8 = null;
        faculty3.setCredentials(credentials8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty4 = new com.yorku.lab.model.Faculty("", "", credentials2, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        boolean boolean10 = faculty3.isActive();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        faculty3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials8 = faculty3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        faculty3.setAffiliation(affiliationType8);
        double double10 = faculty3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        faculty3.setStatus(accountStatus11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        java.lang.String str10 = faculty3.getIdOrCertificationNumber();
        java.lang.String str11 = faculty3.getFullName();
        com.yorku.lab.model.Credentials credentials12 = faculty3.getCredentials();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.UserType userType8 = faculty3.getType();
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType8.equals(com.yorku.lab.enums.UserType.FACULTY));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        faculty3.setFullName("");
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        faculty3.setFullName("hi!");
        faculty3.setFullName("");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        faculty3.setFullName("");
        faculty3.setIdOrCertificationNumber("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        faculty3.setUserId("");
        java.lang.String str12 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        faculty3.setAffiliation(affiliationType8);
        java.lang.String str10 = faculty3.getUserId();
        faculty3.setFullName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        faculty3.setStatus(accountStatus8);
        java.lang.String str10 = faculty3.getFullName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        faculty3.setFullName("");
        faculty3.setHourlyRate(0.0d);
        faculty3.setActive(false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        faculty3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        faculty3.setStatus(accountStatus16);
        faculty3.setActive(false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        java.lang.String str6 = faculty3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials7 = faculty3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        faculty3.setUserId("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty4 = new com.yorku.lab.model.Faculty("", "hi!", credentials2, "");
        faculty4.setUserId("");
        faculty4.setActive(true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) (short) 0);
        faculty3.setHourlyRate(0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        faculty3.setActive(false);
        faculty3.setHourlyRate((double) 'a');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        java.lang.String str10 = faculty3.getIdOrCertificationNumber();
        java.lang.String str11 = faculty3.getFullName();
        java.lang.String str12 = faculty3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        java.lang.String str8 = faculty3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = faculty3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus10 = faculty3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountStatus9 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus9.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + accountStatus10 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus10.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        faculty3.setStatus(accountStatus8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty4 = new com.yorku.lab.model.Faculty("", "hi!", credentials2, "");
        faculty4.setUserId("");
        faculty4.setIdOrCertificationNumber("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        java.lang.String str10 = faculty3.getIdOrCertificationNumber();
        java.lang.String str11 = faculty3.getUserId();
        faculty3.setFullName("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        java.lang.String str8 = faculty3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = faculty3.getStatus();
        com.yorku.lab.enums.UserType userType10 = faculty3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountStatus9 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus9.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType10.equals(com.yorku.lab.enums.UserType.FACULTY));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        java.lang.String str6 = faculty3.getIdOrCertificationNumber();
        faculty3.setHourlyRate(10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) (short) 0);
        faculty3.setIdOrCertificationNumber("hi!");
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        java.lang.String str8 = faculty3.getFullName();
        com.yorku.lab.enums.UserType userType9 = faculty3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + userType9 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType9.equals(com.yorku.lab.enums.UserType.FACULTY));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        faculty3.setAffiliation(affiliationType8);
        faculty3.setActive(false);
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Faculty faculty15 = new com.yorku.lab.model.Faculty("", "", credentials14);
        faculty15.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus18 = faculty15.getStatus();
        faculty3.setStatus(accountStatus18);
        org.junit.Assert.assertTrue("'" + accountStatus18 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus18.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty4 = new com.yorku.lab.model.Faculty("hi!", "", credentials2, "");
        faculty4.setActive(true);
        com.yorku.lab.model.Credentials credentials7 = null;
        faculty4.setCredentials(credentials7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        java.lang.String str10 = faculty3.getUserId();
        faculty3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType13 = faculty3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.UserType userType6 = faculty3.getType();
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType6.equals(com.yorku.lab.enums.UserType.FACULTY));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        faculty3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.Faculty faculty13 = new com.yorku.lab.model.Faculty("", "", credentials12);
        com.yorku.lab.enums.UserType userType14 = faculty13.getType();
        boolean boolean15 = faculty13.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType16 = faculty13.getAffiliation();
        faculty3.setAffiliation(affiliationType16);
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType14.equals(com.yorku.lab.enums.UserType.FACULTY));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        java.lang.String str10 = faculty3.getIdOrCertificationNumber();
        faculty3.setUserId("");
        faculty3.setActive(false);
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        faculty3.setFullName("");
        faculty3.setHourlyRate(0.0d);
        java.lang.String str18 = faculty3.getFullName();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        faculty3.setHourlyRate((double) (short) 10);
        faculty3.setFullName("");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty4 = new com.yorku.lab.model.Faculty("hi!", "", credentials2, "");
        java.lang.String str5 = faculty4.getFullName();
        java.lang.String str6 = faculty4.getUserId();
        com.yorku.lab.model.Credentials credentials7 = null;
        faculty4.setCredentials(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        faculty3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType6 = faculty3.getAffiliation();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + affiliationType6 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType6.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        faculty3.setUserId("");
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Faculty faculty15 = new com.yorku.lab.model.Faculty("", "", credentials14);
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        faculty15.setStatus(accountStatus16);
        faculty15.setHourlyRate((double) '4');
        faculty15.setActive(true);
        com.yorku.lab.model.Credentials credentials22 = null;
        faculty15.setCredentials(credentials22);
        faculty15.setFullName("");
        faculty15.setFullName("");
        faculty15.setActive(true);
        com.yorku.lab.model.Credentials credentials32 = null;
        com.yorku.lab.model.Faculty faculty33 = new com.yorku.lab.model.Faculty("", "", credentials32);
        faculty33.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus36 = faculty33.getStatus();
        faculty15.setStatus(accountStatus36);
        com.yorku.lab.enums.AccountStatus accountStatus38 = faculty15.getStatus();
        faculty3.setStatus(accountStatus38);
        org.junit.Assert.assertTrue("'" + accountStatus36 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus36.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + accountStatus38 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus38.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        java.lang.String str10 = faculty3.getUserId();
        java.lang.String str11 = faculty3.getUserId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        faculty3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        faculty3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.Faculty faculty11 = new com.yorku.lab.model.Faculty("", "", credentials10);
        com.yorku.lab.enums.UserType userType12 = faculty11.getType();
        com.yorku.lab.enums.AffiliationType affiliationType13 = faculty11.getAffiliation();
        faculty3.setAffiliation(affiliationType13);
        java.lang.String str15 = faculty3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials18 = null;
        com.yorku.lab.model.Faculty faculty19 = new com.yorku.lab.model.Faculty("hi!", "", credentials18);
        faculty19.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials24 = null;
        com.yorku.lab.model.Faculty faculty25 = new com.yorku.lab.model.Faculty("", "", credentials24);
        com.yorku.lab.enums.AffiliationType affiliationType26 = null;
        faculty25.setAffiliation(affiliationType26);
        faculty25.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus30 = faculty25.getStatus();
        faculty19.setStatus(accountStatus30);
        faculty3.setStatus(accountStatus30);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType12.equals(com.yorku.lab.enums.UserType.FACULTY));
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + accountStatus30 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus30.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        java.lang.String str10 = faculty3.getIdOrCertificationNumber();
        java.lang.String str11 = faculty3.getFullName();
        java.lang.String str12 = faculty3.getUserId();
        java.lang.String str13 = faculty3.getIdOrCertificationNumber();
        java.lang.String str14 = faculty3.getIdOrCertificationNumber();
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
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        faculty3.setCredentials(credentials10);
        faculty3.setFullName("");
        faculty3.setFullName("");
        faculty3.setActive(true);
        com.yorku.lab.enums.UserType userType18 = faculty3.getType();
        org.junit.Assert.assertTrue("'" + userType18 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType18.equals(com.yorku.lab.enums.UserType.FACULTY));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        faculty3.setAffiliation(affiliationType8);
        java.lang.String str10 = faculty3.getUserId();
        com.yorku.lab.enums.UserType userType11 = faculty3.getType();
        com.yorku.lab.model.Credentials credentials12 = faculty3.getCredentials();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType11.equals(com.yorku.lab.enums.UserType.FACULTY));
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setUserId("");
        faculty3.setActive(false);
        java.lang.String str10 = faculty3.getIdOrCertificationNumber();
        faculty3.setUserId("");
        java.lang.String str13 = faculty3.getIdOrCertificationNumber();
        java.lang.String str14 = faculty3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Faculty faculty3 = new com.yorku.lab.model.Faculty("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        faculty3.setStatus(accountStatus4);
        faculty3.setHourlyRate((double) '4');
        faculty3.setActive(true);
        com.yorku.lab.enums.UserType userType10 = faculty3.getType();
        java.lang.String str11 = faculty3.getUserId();
        faculty3.setUserId("");
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.FACULTY + "'", userType10.equals(com.yorku.lab.enums.UserType.FACULTY));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}

