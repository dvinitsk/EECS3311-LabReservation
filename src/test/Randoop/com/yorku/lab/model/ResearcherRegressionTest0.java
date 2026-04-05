package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResearcherRegressionTest0 {

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
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        com.yorku.lab.model.Credentials credentials6 = null;
        researcher3.setCredentials(credentials6);
        java.lang.Class<?> wildcardClass8 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setIdOrCertificationNumber("hi!");
        boolean boolean10 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        researcher3.setStatus(accountStatus8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials8 = null;
        researcher3.setCredentials(credentials8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher4 = new com.yorku.lab.model.Researcher("", "", credentials2, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        boolean boolean10 = researcher3.isActive();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        researcher3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials8 = researcher3.getCredentials();
        org.junit.Assert.assertNull(credentials8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        double double4 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        java.lang.Class<?> wildcardClass8 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        researcher3.setAffiliation(affiliationType8);
        double double10 = researcher3.getHourlyRate();
        com.yorku.lab.enums.AccountStatus accountStatus11 = null;
        researcher3.setStatus(accountStatus11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        java.lang.String str10 = researcher3.getIdOrCertificationNumber();
        java.lang.String str11 = researcher3.getFullName();
        com.yorku.lab.model.Credentials credentials12 = researcher3.getCredentials();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.UserType userType8 = researcher3.getType();
        org.junit.Assert.assertTrue("'" + userType8 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType8.equals(com.yorku.lab.enums.UserType.RESEARCHER));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        researcher3.setFullName("");
        java.lang.Class<?> wildcardClass16 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        researcher3.setFullName("hi!");
        researcher3.setFullName("");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        researcher3.setFullName("");
        researcher3.setIdOrCertificationNumber("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        researcher3.setUserId("");
        java.lang.String str12 = researcher3.getUserId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        researcher3.setAffiliation(affiliationType8);
        java.lang.String str10 = researcher3.getUserId();
        researcher3.setFullName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) (short) 0);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        researcher3.setStatus(accountStatus8);
        java.lang.String str10 = researcher3.getFullName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        researcher3.setFullName("");
        researcher3.setHourlyRate(0.0d);
        researcher3.setActive(false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        researcher3.setFullName("");
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        researcher3.setStatus(accountStatus16);
        researcher3.setActive(false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        java.lang.String str6 = researcher3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials7 = researcher3.getCredentials();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(credentials7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        researcher3.setUserId("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher4 = new com.yorku.lab.model.Researcher("", "hi!", credentials2, "");
        researcher4.setUserId("");
        researcher4.setActive(true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) (short) 0);
        researcher3.setHourlyRate(0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        researcher3.setActive(false);
        researcher3.setHourlyRate((double) 'a');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        java.lang.String str10 = researcher3.getIdOrCertificationNumber();
        java.lang.String str11 = researcher3.getFullName();
        java.lang.String str12 = researcher3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        java.lang.String str8 = researcher3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = researcher3.getStatus();
        com.yorku.lab.enums.AccountStatus accountStatus10 = researcher3.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountStatus9 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus9.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + accountStatus10 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus10.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        com.yorku.lab.enums.AccountStatus accountStatus8 = null;
        researcher3.setStatus(accountStatus8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher4 = new com.yorku.lab.model.Researcher("", "hi!", credentials2, "");
        researcher4.setUserId("");
        researcher4.setIdOrCertificationNumber("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        double double14 = researcher3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        java.lang.String str10 = researcher3.getIdOrCertificationNumber();
        java.lang.String str11 = researcher3.getUserId();
        researcher3.setFullName("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        java.lang.String str8 = researcher3.getFullName();
        com.yorku.lab.enums.AccountStatus accountStatus9 = researcher3.getStatus();
        com.yorku.lab.enums.UserType userType10 = researcher3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + accountStatus9 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus9.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType10.equals(com.yorku.lab.enums.UserType.RESEARCHER));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        java.lang.String str6 = researcher3.getIdOrCertificationNumber();
        researcher3.setHourlyRate(10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) (short) 0);
        researcher3.setIdOrCertificationNumber("hi!");
        java.lang.Class<?> wildcardClass10 = researcher3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        java.lang.String str8 = researcher3.getFullName();
        com.yorku.lab.enums.UserType userType9 = researcher3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + userType9 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType9.equals(com.yorku.lab.enums.UserType.RESEARCHER));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        researcher3.setAffiliation(affiliationType8);
        researcher3.setActive(false);
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Researcher researcher15 = new com.yorku.lab.model.Researcher("", "", credentials14);
        researcher15.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus18 = researcher15.getStatus();
        researcher3.setStatus(accountStatus18);
        org.junit.Assert.assertTrue("'" + accountStatus18 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus18.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher4 = new com.yorku.lab.model.Researcher("hi!", "", credentials2, "");
        researcher4.setActive(true);
        com.yorku.lab.model.Credentials credentials7 = null;
        researcher4.setCredentials(credentials7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        java.lang.String str10 = researcher3.getUserId();
        researcher3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType13 = researcher3.getAffiliation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.UserType userType6 = researcher3.getType();
        org.junit.Assert.assertTrue("'" + userType6 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType6.equals(com.yorku.lab.enums.UserType.RESEARCHER));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        researcher3.setFullName("hi!");
        com.yorku.lab.model.Credentials credentials12 = null;
        com.yorku.lab.model.Researcher researcher13 = new com.yorku.lab.model.Researcher("", "", credentials12);
        com.yorku.lab.enums.UserType userType14 = researcher13.getType();
        boolean boolean15 = researcher13.isActive();
        com.yorku.lab.enums.AffiliationType affiliationType16 = researcher13.getAffiliation();
        researcher3.setAffiliation(affiliationType16);
        org.junit.Assert.assertTrue("'" + userType14 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType14.equals(com.yorku.lab.enums.UserType.RESEARCHER));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + affiliationType16 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType16.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        java.lang.String str10 = researcher3.getIdOrCertificationNumber();
        researcher3.setUserId("");
        researcher3.setActive(false);
        double double15 = researcher3.getHourlyRate();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        researcher3.setFullName("");
        researcher3.setHourlyRate(0.0d);
        java.lang.String str18 = researcher3.getFullName();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        researcher3.setHourlyRate((double) (short) 10);
        researcher3.setFullName("");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher4 = new com.yorku.lab.model.Researcher("hi!", "", credentials2, "");
        java.lang.String str5 = researcher4.getFullName();
        java.lang.String str6 = researcher4.getUserId();
        com.yorku.lab.model.Credentials credentials7 = null;
        researcher4.setCredentials(credentials7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        researcher3.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AffiliationType affiliationType6 = researcher3.getAffiliation();
        java.lang.Class<?> wildcardClass7 = researcher3.getClass();
        org.junit.Assert.assertTrue("'" + affiliationType6 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType6.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        researcher3.setUserId("");
        com.yorku.lab.model.Credentials credentials14 = null;
        com.yorku.lab.model.Researcher researcher15 = new com.yorku.lab.model.Researcher("", "", credentials14);
        com.yorku.lab.enums.AccountStatus accountStatus16 = null;
        researcher15.setStatus(accountStatus16);
        researcher15.setHourlyRate((double) '4');
        researcher15.setActive(true);
        com.yorku.lab.model.Credentials credentials22 = null;
        researcher15.setCredentials(credentials22);
        researcher15.setFullName("");
        researcher15.setFullName("");
        researcher15.setActive(true);
        com.yorku.lab.model.Credentials credentials32 = null;
        com.yorku.lab.model.Researcher researcher33 = new com.yorku.lab.model.Researcher("", "", credentials32);
        researcher33.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus36 = researcher33.getStatus();
        researcher15.setStatus(accountStatus36);
        com.yorku.lab.enums.AccountStatus accountStatus38 = researcher15.getStatus();
        researcher3.setStatus(accountStatus38);
        org.junit.Assert.assertTrue("'" + accountStatus36 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus36.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + accountStatus38 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus38.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        java.lang.String str10 = researcher3.getUserId();
        java.lang.String str11 = researcher3.getUserId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.model.Credentials credentials4 = null;
        researcher3.setCredentials(credentials4);
        com.yorku.lab.enums.AffiliationType affiliationType6 = null;
        researcher3.setAffiliation(affiliationType6);
        com.yorku.lab.model.Credentials credentials10 = null;
        com.yorku.lab.model.Researcher researcher11 = new com.yorku.lab.model.Researcher("", "", credentials10);
        com.yorku.lab.enums.UserType userType12 = researcher11.getType();
        com.yorku.lab.enums.AffiliationType affiliationType13 = researcher11.getAffiliation();
        researcher3.setAffiliation(affiliationType13);
        java.lang.String str15 = researcher3.getIdOrCertificationNumber();
        com.yorku.lab.model.Credentials credentials18 = null;
        com.yorku.lab.model.Researcher researcher19 = new com.yorku.lab.model.Researcher("hi!", "", credentials18);
        researcher19.setIdOrCertificationNumber("hi!");
        com.yorku.lab.model.Credentials credentials24 = null;
        com.yorku.lab.model.Researcher researcher25 = new com.yorku.lab.model.Researcher("", "", credentials24);
        com.yorku.lab.enums.AffiliationType affiliationType26 = null;
        researcher25.setAffiliation(affiliationType26);
        researcher25.setIdOrCertificationNumber("");
        com.yorku.lab.enums.AccountStatus accountStatus30 = researcher25.getStatus();
        researcher19.setStatus(accountStatus30);
        researcher3.setStatus(accountStatus30);
        org.junit.Assert.assertTrue("'" + userType12 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType12.equals(com.yorku.lab.enums.UserType.RESEARCHER));
        org.junit.Assert.assertTrue("'" + affiliationType13 + "' != '" + com.yorku.lab.enums.AffiliationType.UNIVERSITY + "'", affiliationType13.equals(com.yorku.lab.enums.AffiliationType.UNIVERSITY));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + accountStatus30 + "' != '" + com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL + "'", accountStatus30.equals(com.yorku.lab.enums.AccountStatus.PENDING_APPROVAL));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        java.lang.String str10 = researcher3.getIdOrCertificationNumber();
        java.lang.String str11 = researcher3.getFullName();
        java.lang.String str12 = researcher3.getUserId();
        java.lang.String str13 = researcher3.getIdOrCertificationNumber();
        java.lang.String str14 = researcher3.getIdOrCertificationNumber();
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
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.model.Credentials credentials10 = null;
        researcher3.setCredentials(credentials10);
        researcher3.setFullName("");
        researcher3.setFullName("");
        researcher3.setActive(true);
        com.yorku.lab.enums.UserType userType18 = researcher3.getType();
        org.junit.Assert.assertTrue("'" + userType18 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType18.equals(com.yorku.lab.enums.UserType.RESEARCHER));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        com.yorku.lab.enums.AffiliationType affiliationType8 = null;
        researcher3.setAffiliation(affiliationType8);
        java.lang.String str10 = researcher3.getUserId();
        com.yorku.lab.enums.UserType userType11 = researcher3.getType();
        com.yorku.lab.model.Credentials credentials12 = researcher3.getCredentials();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + userType11 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType11.equals(com.yorku.lab.enums.UserType.RESEARCHER));
        org.junit.Assert.assertNull(credentials12);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setUserId("");
        researcher3.setActive(false);
        java.lang.String str10 = researcher3.getIdOrCertificationNumber();
        researcher3.setUserId("");
        java.lang.String str13 = researcher3.getIdOrCertificationNumber();
        java.lang.String str14 = researcher3.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Credentials credentials2 = null;
        com.yorku.lab.model.Researcher researcher3 = new com.yorku.lab.model.Researcher("", "", credentials2);
        com.yorku.lab.enums.AccountStatus accountStatus4 = null;
        researcher3.setStatus(accountStatus4);
        researcher3.setHourlyRate((double) '4');
        researcher3.setActive(true);
        com.yorku.lab.enums.UserType userType10 = researcher3.getType();
        java.lang.String str11 = researcher3.getUserId();
        researcher3.setUserId("");
        org.junit.Assert.assertTrue("'" + userType10 + "' != '" + com.yorku.lab.enums.UserType.RESEARCHER + "'", userType10.equals(com.yorku.lab.enums.UserType.RESEARCHER));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}

