package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CredentialsRegressionTest0 {

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        java.lang.String str7 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass8 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.Class<?> wildcardClass5 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass4 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        java.lang.String str6 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        boolean boolean13 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass7 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("hi!");
        java.lang.String str9 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        java.lang.String str7 = credentials2.getEmail();
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("hi!");
        java.lang.String str7 = credentials2.getEmail();
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("hi!");
        java.lang.String str7 = credentials2.getEmail();
        boolean boolean9 = credentials2.verifyPassword("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.Class<?> wildcardClass3 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        java.lang.String str9 = credentials2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        java.lang.String str8 = credentials2.getPasswordHash();
        java.lang.String str9 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        credentials2.setPasswordHash("hi!");
        java.lang.String str6 = credentials2.getEmail();
        java.lang.String str7 = credentials2.getEmail();
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        java.lang.String str6 = credentials2.getEmail();
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        boolean boolean6 = credentials2.verifyPassword("hi!");
        java.lang.String str7 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setEmail("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        java.lang.String str9 = credentials2.getEmail();
        java.lang.String str10 = credentials2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        java.lang.String str6 = credentials2.getEmail();
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getEmail();
        boolean boolean6 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setEmail("");
        java.lang.String str8 = credentials2.getEmail();
        credentials2.setEmail("");
        java.lang.String str11 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getPasswordHash();
        java.lang.String str7 = credentials2.getEmail();
        credentials2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        java.lang.String str10 = credentials2.getPasswordHash();
        boolean boolean12 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        credentials2.setEmail("hi!");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        credentials2.setPasswordHash("hi!");
        java.lang.String str6 = credentials2.getEmail();
        java.lang.String str7 = credentials2.getEmail();
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        boolean boolean4 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        java.lang.String str7 = credentials2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        boolean boolean11 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        java.lang.String str9 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        boolean boolean4 = credentials2.verifyPassword("");
        java.lang.String str5 = credentials2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        java.lang.String str8 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        java.lang.String str11 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass9 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        credentials2.setEmail("hi!");
        boolean boolean7 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        credentials2.setEmail("hi!");
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass5 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setEmail("");
        java.lang.String str8 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        credentials2.setEmail("");
        boolean boolean8 = credentials2.verifyPassword("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        java.lang.String str9 = credentials2.getEmail();
        boolean boolean11 = credentials2.verifyPassword("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getPasswordHash();
        java.lang.String str7 = credentials2.getEmail();
        java.lang.String str8 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getEmail();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("hi!");
        java.lang.String str7 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        java.lang.String str10 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setEmail("");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        java.lang.String str10 = credentials2.getPasswordHash();
        java.lang.String str11 = credentials2.getPasswordHash();
        boolean boolean13 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }
}

